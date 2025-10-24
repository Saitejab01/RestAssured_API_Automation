package CRUD_Operations_Without_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class SampleTestForDeletingAProject {
	@Test
	public void postProjectToServer() {
		Response resp = delete("http://49.249.28.218:8091/project/NH_PROJ_032");
		resp.then().log().all();
		resp.then().assertThat().statusCode(204);
	}
}
