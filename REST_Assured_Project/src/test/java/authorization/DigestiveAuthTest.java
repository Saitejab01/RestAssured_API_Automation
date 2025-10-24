package authorization;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DigestiveAuthTest {
	@Test
	public void basicAuth() {
		baseURI="http://49.249.29.5:8091";
		given()
		.auth().digest("rmgyantra", "rmgy@9999")
		.log()
		.all()
		.when()
		.get(baseURI+"/login")
		.then()
		.log()
		.all();
	}
}
