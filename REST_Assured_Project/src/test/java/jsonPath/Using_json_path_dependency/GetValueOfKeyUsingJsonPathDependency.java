package jsonPath.Using_json_path_dependency;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;

public class GetValueOfKeyUsingJsonPathDependency {
	@Test
	public void getValueForKey(){
		Response resp = given().get("http://49.249.28.218:8091/projects-paginated");
		List<String> list = JsonPath.read(resp.asString(),".content[*].projectId");
		resp.then().log().all();
		System.out.println(list);
	}
}
