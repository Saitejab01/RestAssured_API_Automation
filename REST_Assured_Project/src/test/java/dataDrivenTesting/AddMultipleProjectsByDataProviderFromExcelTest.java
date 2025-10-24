package dataDrivenTesting;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import fileUtility.ExcelFileUtil;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.IOException;

public class AddMultipleProjectsByDataProviderFromExcelTest {
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
	public Object[][] getData() throws EncryptedDocumentException, IOException {
		ExcelFileUtil eUtil = new ExcelFileUtil();
		int rowNum=eUtil.getTheLastRowIndex("Sheet1");
		Object[][] objArr = new Object[rowNum][2];
		for (int i = 0; i < rowNum; i++) {
			objArr[i][0]=eUtil.getDataFromExcel("Sheet1", i+1, 0);	
			objArr[i][1]=eUtil.getDataFromExcel("Sheet1", i+1, 1);	
		}
		return objArr;
	}
}
