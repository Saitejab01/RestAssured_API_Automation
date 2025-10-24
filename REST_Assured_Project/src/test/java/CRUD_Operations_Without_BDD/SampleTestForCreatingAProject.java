package CRUD_Operations_Without_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class SampleTestForCreatingAProject {
	@Test
	public void postProjectToServer() {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("createdBy", "saiteja");
		jsonObj.put("projectName", "NinzaProject01");
		jsonObj.put("status", "CREATED");
		jsonObj.put("teamSize", 0);
		RequestSpecification req = given();
		req.contentType(ContentType.JSON);
		req.body(jsonObj.toJSONString());
		Response resp = req.post("http://49.249.28.218:8091/addProject");
		resp.then().log().all();
		resp.then().assertThat().statusCode(201);
		
	}
}
