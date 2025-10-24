package sampleTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredSampleTest {
	@Test
	public void getUsersList() {
		Response resp = RestAssured.get("https://www.shoppersstack.com/shopping/shoppers/290473");
		System.out.println(resp.prettyPrint());
	}
}
