package mockingBySpark;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreditCardMock {
	@Test
	public void creditMock() {
		JSONObject jobj =  new JSONObject();
		jobj.put("creditcard", "1234567890");
//		jobj.put("cvv", "123");
//		jobj.put("cardName", "saiteja");
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.when()
		.post("http://localhost:8889/credit-card")
		.then()
		.assertThat().body("status", Matchers.equalTo("payment is done"))
		.log().all();
	}
}
