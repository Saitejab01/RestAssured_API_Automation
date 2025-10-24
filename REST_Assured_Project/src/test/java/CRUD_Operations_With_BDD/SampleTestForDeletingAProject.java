package CRUD_Operations_With_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class SampleTestForDeletingAProject {
	@Test
	public void deleteAProjectFromServer() {
		given()
		.delete("http://49.249.28.218:8091/project/NH_PROJ_067")
		.then()
		.assertThat()
		.statusCode(204)
		.log()
		.all();
	}
}
