package validate.ResponseHeader;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ValidateResponseTime {
	@Test
	public void validateResponseTime() {
		Response resp = given().get("http://49.249.28.218:8091/projects");
		resp.time();
		resp.timeIn(TimeUnit.SECONDS);
		resp.then().assertThat().time(Matchers.lessThan(900l));
		resp.then().assertThat().time(Matchers.greaterThan(300l));
		resp.then().assertThat().time(Matchers.both(Matchers.lessThan(900l)).and(Matchers.greaterThan(300l)));
		
	}
}
