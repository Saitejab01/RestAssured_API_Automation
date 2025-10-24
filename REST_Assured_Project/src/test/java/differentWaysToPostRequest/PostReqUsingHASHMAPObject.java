package differentWaysToPostRequest;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class PostReqUsingHASHMAPObject {
	public static void main(String[] args) {
		HashMap<String, Object> jsonObj = new HashMap<>();
		jsonObj.put("createdBy", "saiteja");
		jsonObj.put("projectName", "NinzaProject07");
		jsonObj.put("status", "CREATED");
		jsonObj.put("teamSize", 0);
		given()
		.contentType(ContentType.JSON)
		.body(jsonObj)
		.when()
		.post("http://49.249.28.218:8091/addProject")
		.then()
		.assertThat()
		.statusCode(201)
		.log().all();
	}
}
