package requestChaning;

import org.json.simple.JSONObject;

import POJO.util.PojoClass1;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Random;

public class RequestChainingToDeleteProject {
	public static void main(String[] args) {
		Random r = new Random();
		int randNum=r.nextInt(5000);
		PojoClass1 p = new PojoClass1("saiteja", "Airtel"+randNum, "created", 0);
		
		//API 1 --- CreateProject
		Response resp = given()
		.contentType(ContentType.JSON)
		.body(p)
		.when()
		.post("http://49.249.28.218:8091/addProject");
		String projectId = resp.jsonPath().get("projectId");
		System.out.println(projectId);
		resp.then()
		.assertThat()
		.statusCode(201)
		.log().all();
		
		//API 2 --- DeleteProject
		
		given().delete("http://49.249.28.218:8091/project/"+projectId)
		.then()
		.assertThat()
		.statusCode(204)
		.log()
		.all();
	}
}
