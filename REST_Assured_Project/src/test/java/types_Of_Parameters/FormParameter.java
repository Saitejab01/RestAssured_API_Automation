package types_Of_Parameters;

import static io.restassured.RestAssured.*;

import com.fasterxml.jackson.databind.ObjectMapper;


public class FormParameter {

	public static void main(String[] args) {

		given()
		.formParam("teamSize", 0)
		.when()
		.post("http://49.249.28.218:8091/project")
		.then()
		.log()
		.all();

	}

}
