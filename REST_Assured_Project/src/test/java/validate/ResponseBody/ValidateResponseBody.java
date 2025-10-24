package validate.ResponseBody;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ValidateResponseBody {
	@Test
	public void validateResponseBody() {
		Response resp = given().get("http://49.249.28.218:8091/projects-paginated");
		resp.then().assertThat().body("numberOfElements", Matchers.equalTo(20));
		resp.then().assertThat().body("content[0].teamSize", Matchers.equalTo(0));
		resp.then().assertThat().body("pageable.sort.unsorted", Matchers.equalTo(true));
		resp.then().log().all();
	}
}
