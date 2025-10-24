package CRUD_Operations_Without_BDD;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class SampleTestForGetAllProjects {
	@Test
	public void getAllProjects() {
		Response resp = get("http://49.249.28.218:8091/projects");
//		System.out.println(resp.prettyPrint());
		resp.then().assertThat().statusCode(200);
		resp.then().log().all();
		
	}
}
