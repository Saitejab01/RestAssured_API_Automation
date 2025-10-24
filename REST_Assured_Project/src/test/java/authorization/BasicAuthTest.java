package authorization;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicAuthTest {
	@Test
	public void basicAuth() {
		baseURI="http://49.249.29.5:8091";
		given()
		.auth().basic("rmgyantra", "rmgy@9999")
		.log()
		.all()
		.when()
		.get(baseURI+"/login")
		.then()
		.log()
		.all();
	}
}
