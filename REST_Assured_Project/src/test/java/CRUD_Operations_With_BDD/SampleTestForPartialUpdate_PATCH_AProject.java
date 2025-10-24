package CRUD_Operations_With_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class SampleTestForPartialUpdate_PATCH_AProject {
	@Test
	public void updateProjectUsingPatchInServer() {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("createdBy", "BANDI SAITEJA");
		given()
		.contentType(ContentType.JSON)
		.body(jsonObj.toJSONString())
		.when()
		.patch("http://49.249.28.218:8091/project/NH_PROJ_081")
		.then()
		.assertThat()
		.statusCode(200)
		.log()
		.all();
		
	}
}
