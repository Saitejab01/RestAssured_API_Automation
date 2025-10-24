package validate.ResponseBody;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetSpecificKeyValueFromResponseBodyUsingJsonPath {
	@Test
	public void getkeysValue() {
		Response resp = given().get("http://49.249.28.218:8091/projects-paginated");
		int numberOfElements=resp.jsonPath().get("numberOfElements");
		String projectId=resp.jsonPath().get("content[10].projectId");
		boolean unSorted=resp.jsonPath().get("pageable.sort.unsorted");
		resp.then().log().all();
		System.out.println(numberOfElements);
		System.out.println(projectId);
		System.out.println(unSorted);
	}
}
