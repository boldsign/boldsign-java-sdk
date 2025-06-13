package integration;

import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.api.UserApi;
import com.boldsign.model.*;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsersApiTest {
    private static UserApi userApi;
    private static ApiClient apiClient;
    private static String emailId;
    private static String userId;

    private static String randomNumbers() {
        Random rand = new Random();
        int rangeStart = (int) Math.pow(10, 3 - 1);
        int rangeEnd = (int) (Math.pow(10, 3) - 1);
        int randomNum = rand.nextInt(rangeEnd - rangeStart + 1) + rangeStart;
        return String.valueOf(randomNum);
    }

    @BeforeAll
    public static void setUp() throws Exception {
        emailId = null;
        userId = null;
        String apiKey = System.getenv("API_KEY");
        String hostUrl = System.getenv("HOST_URL");
        if (apiKey == null || hostUrl == null) {
            throw new IllegalArgumentException("Environment variables 'APIKey' or 'hostUrl' are not set.");
        }
        apiClient = new ApiClient();
        apiClient.setApiKey(apiKey);
        apiClient.setBasePath(hostUrl);
        userApi = new UserApi(apiClient);
        String randomStr = randomNumbers();
        emailId = "sdktesting" + randomStr + "@syncfusion.com";
    }

    @Test
    @Order(1)
    public void testCreateUserPositive() {
        try {
            CreateUser createUserRequest = new CreateUser();
            createUserRequest.setEmailId(emailId);
            List<CreateUser> createUserList = new ArrayList<>();
            createUserList.add(createUserRequest);
            userApi.createUser(createUserList);
            Assertions.assertTrue(true);
            System.out.println("TestUserID: " + emailId);
            System.out.println("Created UserId: " + userId);
        } catch (ApiException e) {
            Assertions.fail("API Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        } finally {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }


    @Test
    @Order(2)
    public void testCreateUsersNegativeWithDuplicateUsers() {
        try {
            List<CreateUser> createUserList = new ArrayList<>();
                CreateUser createUserRequest = new CreateUser();
                createUserRequest.setEmailId(emailId);
                createUserList.add(createUserRequest);

            userApi.createUser(createUserList);
            Assertions.fail("Expected API exception due to exceeding user creation limit or invalid data.");
        } catch (ApiException e) {
            Assertions.assertTrue(e.getMessage().contains("This user is already on another team, or has a disposable email, which is not allowed."));
        } catch (Exception e) {
            Assertions.fail("Unexpected exception occurred: " + e.getMessage());
        } finally {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Test
    @Order(3)
    public void testCreateUsersNegative() throws Exception {
        CreateUser createUser = new CreateUser();
        createUser.setEmailId("invalid-emailId");
        try {
            userApi.createUser(Arrays.asList(createUser));
            Assertions.fail("Expected ApiException to be thrown due to invalid team ID");
        } catch (ApiException e) {
            Assertions.assertTrue(e.getMessage().contains("The email property does not contain a valid email address"));
            System.out.println("Expected error occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(4)
    public void testGetUserListPositive() throws ApiException {
        System.out.println("TestUserID: " + emailId);
        int page = 1;
        int pageSize = 20;
        String search = emailId;
        UserRecords userListResponse = userApi.listUsers(page, pageSize, search);
        Assertions.assertNotNull(userListResponse);
        Assertions.assertNotNull(userListResponse.getResult());
        List<UsersDetails> usersList = userListResponse.getResult();
        for (UsersDetails user : usersList) {
            if (user.getEmail().equals(emailId)) {
                userId =user.getUserId();
                System.out.println("TestUserID: " + userId);
                break;
            }
        }
        Assertions.assertNotNull(userId, "User ID should not be null.");
    }

    @Test
    @Order(5)
    public void testListUsersNegative() throws Exception {
        Integer invalidPage = 100;
        Integer invalidPageSize = 200;
        String invalidSearch = "";
        try {
            UserRecords response = userApi.listUsers(invalidPage, invalidPageSize, invalidSearch);
            Assertions.fail("Expected ApiException due to invalid page number or search term");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("Provide a valid page size between 1 and 100"));
        }
    }

    @Test
    @Order(6)
    public void testListUsersNegativeWithNegativeValues() throws Exception {
        Integer invalidPage = -10;
        Integer invalidPageSize = -20;
        String invalidSearch = "";
        try {
            UserRecords response = userApi.listUsers(invalidPage, invalidPageSize, invalidSearch);
            Assertions.fail("Expected ApiException due to invalid page number or search term");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("Page number should be greater than 0"));
        }
    }

    @Test
    @Order(7)
    public void testUpdateUserRoleNegative() throws Exception {
        UpdateUser updateUserRole = new UpdateUser();
        updateUserRole.setUserId("invalid-userId");
        try {
            userApi.updateUser(updateUserRole);
            Assertions.fail("Expected ApiException to be thrown due to invalid user role");
        } catch (ApiException e) {
            Assertions.assertTrue(e.getMessage().contains("Provide valid user id."));
        }
    }

    @Test
    @Order(8)
    public void testGetUserPositive() throws Exception {
        String userId = UsersApiTest.userId;
        UserProperties userDetails = userApi.getUser(userId);
        Assertions.assertNotNull(userDetails);
        Assertions.assertEquals(userId, userDetails.getUserId());
        Assertions.assertNotNull(userDetails.getEmail());
        System.out.println("User ID: " + userDetails.getUserId());
    }

    @Test
    @Order(9)
    public void testGetUserNegative() throws Exception {
        String Userid = "invalid-userId";
        try {
            UserProperties userDetails = userApi.getUser(Userid);
            Assertions.fail("Expected ApiException due to invalid user ID ");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("Provide valid user id."));
            System.out.println("Expected error occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(10)
    public void testGetUserNegativeWithEmptyUserId() throws Exception {
        String Userid = "";
        try {
            UserProperties userDetails = userApi.getUser(Userid);
            Assertions.fail("Expected ApiException due to invalid user ID ");
        } catch (ApiException e) {
            Assertions.assertEquals(400, e.getCode());
            Assertions.assertTrue(e.getMessage().contains("The userId field is required."));
            System.out.println("Expected error occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(11)
    public void testResendInvitationPositive() throws Exception {
        String userId = UsersApiTest.userId;
        userApi.resendInvitation(userId);
        Assertions.assertTrue(true, "Invitation resent successfully!");
    }

    @Test
    @Order(12)
    public void testResendInvitationNegative() {
        String invalidUserId = "invalid-userId";
        try {
            userApi.resendInvitation(invalidUserId);
            Assertions.fail("Expected ApiException due to invalid user ID");
        } catch (ApiException e) {
            Assertions.assertTrue(e.getMessage().contains("Provide valid user id"));
        }
    }

    @Test
    @Order(13)
    public void testResendInvitationNegativeWithEmptyUserId() {
        String invalidUserId = "";
        try {
            userApi.resendInvitation(invalidUserId);
            Assertions.fail("Expected ApiException due to invalid user ID");
        } catch (ApiException e) {
            Assertions.assertTrue(e.getMessage().contains("Provide required value."));
        }
    }

    @Test
    @Order(14)
    public void testCancelInvitationPositive() throws Exception {
        userApi.cancelInvitation(userId);
        Assertions.assertTrue(true, "Invitation canceled successfully!");
        System.out.println("Invitation canceled successfully!");
    }

    @Test
    @Order(15)
    public void testCancelInvitationNegative() throws Exception {
        String invalidUserId = "invalid-userId";
        try {
            userApi.cancelInvitation(invalidUserId);
            Assertions.fail("Expected ApiException was not thrown.");
        } catch (ApiException e) {
            Assertions.assertTrue(e.getMessage().contains("Provide valid user id."));
            System.out.println("Expected exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Order(16)
    public void testCancelInvitationNegativeWithEmptyUserId() throws Exception {
        String invalidUserId = "";
        try {
            userApi.cancelInvitation(invalidUserId);
            Assertions.fail("Expected ApiException was not thrown.");
        } catch (ApiException e) {
            Assertions.assertTrue(e.getMessage().contains("Provide required value."));
            System.out.println("Expected exception occurred: " + e.getMessage());
        }
    }
}