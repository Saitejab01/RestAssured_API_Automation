package requestChaning;

import static io.restassured.RestAssured.given;

import java.util.Random;

import POJO.util.EmployeePojo;
import POJO.util.PojoClass1;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AddAnEmployeeToTheProject {

	public static void main(String[] args) {
		Random r = new Random();
		int randNum=r.nextInt(5000);
		PojoClass1 p = new PojoClass1("saiteja", "Airtel"+randNum, "created", 0);
		
		//API 1 --- CreateProject
		Response resp = given()
		.contentType(ContentType.JSON)
		.body(p)
		.when()
		.post("http://49.249.28.218:8091/addProject");
		String projectName = resp.jsonPath().get("projectName");
		String projectId = resp.jsonPath().get("projectId");
		System.out.println(projectName);
		System.out.println(projectId);
		resp.then()
		.assertThat()
		.statusCode(201)
		.log().all();
		
		//API 2 --- Add Employee To Project
 
		EmployeePojo empObject = new EmployeePojo("Assosiate Automation Developer", "27/06/2003", "saiteja@gmail.com", "User_"+randNum, 18, "9874563210", projectName, "ROLE_ADMIN", "User_"+randNum);
		Response empResp = given()
		.contentType(ContentType.JSON)
		.body(empObject)
		.when()
		.post("http://49.249.28.218:8091/employees");
		String employeeId=empResp.jsonPath().get("employeeId");
		empResp.then().assertThat().statusCode(201)
		.log().all();
		
		//API 3 delete the Employee
		given().delete("http://49.249.28.218:8091/employee/"+employeeId)
		.then()
//		.assertThat().statusCode(200)
		.log()
		.all();
		
		//API 4 delete the project
		given().delete("http://49.249.28.218:8091/project/"+projectId)
		.then()
		.assertThat()
		.statusCode(204)
		.log()
		.all();
	}

}
