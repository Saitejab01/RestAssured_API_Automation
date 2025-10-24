package differentWaysToPostRequest;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostReqUsingJSONObject {
	public static void main(String[] args) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("createdBy", "saiteja");
		jsonObj.put("projectName", "NinzaProject05");
		jsonObj.put("status", "CREATED");
		jsonObj.put("teamSize", 0);
		given()
		.contentType(ContentType.JSON)
		.body(jsonObj.toJSONString())
		.when()
		.post("http://49.249.28.218:8091/addProject")
		.then()
		.assertThat()
		.statusCode(201)
		.log().all();
	}
}
