package requestChaning;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetPayrolesOfEmployees_Auth {
	public static void main(String[] args) {
		JSONObject jobj = new JSONObject();
		jobj.put("password", "rmgy@9999");
		jobj.put("username", "rmgyantra");
		Response resp=given()
//		.formParam("client_id", "ninza-client")
//		.formParam("client_secret", "gPQBf1Yxew50MccMhzos1GefIyiSnXzM")
//		.formParam("grant_type", "client_credentials")
				.contentType(ContentType.JSON)
				.body(jobj.toJSONString())
		.when()
//		.post("http://49.249.28.218:8180/auth/realms/ninza/protocol/openid-connect/token");
		.post("http://49.249.28.218:8180/login");
		resp.then().log().all();
//		String token=resp.jsonPath().get("token");
		
		
		
//		given()
//		.auth().oauth2(token)
//		.when()
//		.get("http://49.249.28.218:8091/admin/payrolls")
//		.then()
//		.assertThat().statusCode(200)
//		.log()
//		.all();
		
	}
}
