package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test
    public void getDataTest() {
        System.out.println("Test started..");
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        Assert.assertEquals(200, response.getStatusCode());
        System.out.println("================ The status code is " + response.getStatusCode() + " =================");
        System.out.println("Test finished..");
    }
}
