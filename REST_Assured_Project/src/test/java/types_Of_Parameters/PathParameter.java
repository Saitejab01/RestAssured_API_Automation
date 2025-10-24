package types_Of_Parameters;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;

import io.restassured.response.Response;

public class PathParameter {

	public static void main(String[] args) {
		Response resp = given()
		.pathParam("projectId", "NH_PROJ_109") 
		.when()
		.get("http://49.249.28.218:8091/project/{projectId}");
		resp.then()
		.assertThat().time(Matchers.both(Matchers.lessThan(900l)).and(Matchers.greaterThan(300l)))
		.log()
		.all();
		resp.time();
	}

}
