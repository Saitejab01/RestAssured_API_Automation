package differentWaysToPostRequest;

import org.json.simple.JSONObject;

import POJO.util.PojoClass1;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Random;

public class PostReqUsingPOJOObject {
	public static void main(String[] args) {
		Random r = new Random();
		int randNum=r.nextInt(5000);
		PojoClass1 p = new PojoClass1("saiteja", "Random2"+randNum, "created", 0);
		given()
		.contentType(ContentType.JSON)
		.body(p)
		.when()
		.post("http://49.249.28.218:8091/addProject")
		.then()
		.assertThat()
		.statusCode(201)
		.log().all();
	}
}
