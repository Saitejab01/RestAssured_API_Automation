package CRUD_Operations_With_BDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class SampleTestForGetAllProjects {
	@Test
	public void getAllProjects() {
		get("http://49.249.28.218:8091/projects")
		.then()
		.assertThat()
		.statusCode(200)
		.log()
		.all();
		
	}
}
