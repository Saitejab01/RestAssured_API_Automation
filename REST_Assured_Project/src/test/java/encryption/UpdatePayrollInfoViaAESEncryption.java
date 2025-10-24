package encryption;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import static encryptionOfDataByAES.AESEncryptionAndDecryption.*;

public class UpdatePayrollInfoViaAESEncryption {
	@Test
	public void sampleTest() throws Exception {
		String privateKey="Ac03tEam@j!tu_#1";
		String jBody = "{ \"employee\": { \"empId\":\"NH_00021\", \"designation\": \"Architect\", \"dob\": \"03/03/2003\", \"email\": \"tj@gmail.com\", \"empName\": \"Amogh Jadhav\", \"experience\": 3.5, \"mobileNo\": \"8971601234\", \"project\": \"API_Testing347\", \"role\": \"ROLE_EMPLOYEE\", \"username\": “AJ_ARCHITECT” }, \"basicPlusVda\": 5000, \"hra\": 5000, \"insurance\": 5000, \"lta\": 5000, \"lwf\": 5000, \"netPay\": 5000, \"payroll_id\": 5000, \"pf\": 5000, \"pt\": 5000, \"stat_bonus\": 5000, \"status\": “Active” }";
		String jReqBody = encrypt(jBody,privateKey);
		System.out.println(jReqBody);
		Response resp=given()
		.body(jReqBody)
		.when()
		.put("http://49.249.28.218:8091/payroll");
		resp.then()
		.log()
		.all();
		System.out.println(decrypt(resp.getBody().asString(), privateKey));
	}
}
