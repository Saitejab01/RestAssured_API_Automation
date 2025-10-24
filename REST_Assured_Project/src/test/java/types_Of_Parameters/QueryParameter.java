package types_Of_Parameters;

import static io.restassured.RestAssured.*;

public class QueryParameter {

	public static void main(String[] args) {
		given()
		.queryParam("teamSize", 0)
		.log().all()
		.when()
		.get("http://49.249.28.218:8091/project")
		.then()
		.log()
		.all();

	}

}
