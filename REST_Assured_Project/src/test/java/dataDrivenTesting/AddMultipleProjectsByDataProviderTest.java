package dataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddMultipleProjectsByDataProviderTest {
	@Test(dataProvider = "getData")
	public void sampleTest(String proName , String status) {
		String reqBody ="{\r\n"
				+ "  \"createdBy\": \"saiteja\",\r\n"
				+ "  \"projectName\": \""+proName+"\",\r\n"
				+ "  \"status\": \""+status+"\",\r\n"
				+ "  \"teamSize\": 0\r\n"
				+ "}";
		given()
		.contentType(ContentType.JSON)
		.body(reqBody)
		.when()
		.post("http://49.249.28.218:8091/addProject")
		.then()
		.log()
		.all();
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] objArr = new Object[3][2];
		objArr[0][0]="Air_India_01";
		objArr[0][1]="Created";
		objArr[1][0]="Air_India_02";
		objArr[1][1]="Created";
		objArr[2][0]="Air_India_03";
		objArr[2][1]="Created";
		return objArr;
	}
}
