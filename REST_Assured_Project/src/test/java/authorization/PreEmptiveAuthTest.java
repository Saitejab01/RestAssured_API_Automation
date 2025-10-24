package authorization;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PreEmptiveAuthTest {
	@Test
	public void basicAuth() {
		baseURI="http://49.249.29.5:8091";
		given()
		.auth().preemptive().basic("rmgyantra", "rmgy@9999")
		.log()
		.all()
		.when()
		.get(baseURI+"/login")
		.then()
		.log()
		.all();
	}
}
