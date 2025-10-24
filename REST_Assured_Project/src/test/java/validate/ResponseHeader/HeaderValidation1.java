package validate.ResponseHeader;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HeaderValidation1 {
	@Test
	public void headerValidation() {
		Response resp = given().get("http://49.249.28.218:8091/projects");
		resp.then().assertThat().contentType(ContentType.JSON);
		resp.then().assertThat().statusLine("HTTP/1.1 200 ");
		resp.then().assertThat().statusCode(200);
		resp.then().assertThat().header("Pragma", "no-cache");
		resp.then().log().all();
	}
}
