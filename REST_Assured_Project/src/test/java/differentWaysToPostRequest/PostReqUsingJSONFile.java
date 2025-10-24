package differentWaysToPostRequest;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;

public class PostReqUsingJSONFile {
	public static void main(String[] args) {
		File f = new File("./jsonFile1.json");
		given()
		.contentType(ContentType.JSON)
		.body(f)
		.when()
		.post("http://49.249.28.218:8091/addProject")
		.then()
		.assertThat()
		.statusCode(201)
		.log().all();
	}
}
