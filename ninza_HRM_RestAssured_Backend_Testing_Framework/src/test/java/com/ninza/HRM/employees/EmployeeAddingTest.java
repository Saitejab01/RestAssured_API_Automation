package com.ninza.HRM.employees;

import static io.restassured.RestAssured.given;

import static iEndPoints.IEndPoint.*;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ninza.HRM.BaseAPIClass.BaseAPIClass;
import POJO.util.EmployeePojo;
import POJO.util.PojoClass1;

public class EmployeeAddingTest extends BaseAPIClass {
	PojoClass1 project ;
	String projectName;
	String userName;
	String BaseURI;
	@Test
	public void addEmployee() throws Throwable {
		projectName = "FireFlink_"+jlib.getRandomNumber();
		BaseURI = flib.getValueFromPropertiesFile("BASEUri");
		userName = "Sairam_"+jlib.getRandomNumber();
		project = new PojoClass1(userName, projectName, "Created", 0);
		given()
				.spec(reqSpecObject)
				.body(project)
				.when()
				.post(ADD_PROJECT)
				.then()
				.spec(resSpecObject);
		System.out.println(projectName+" project created");
		
		String expectedMessage= "Employee Added Successfully";
		EmployeePojo emp = new EmployeePojo("Architect", "03/06/2003", "abc@gmail.com", userName, 3, "9874563210", projectName, "ROLE_EMPLOYEE", userName);
		given()
		.spec(reqSpecObject)
		.body(emp)
		.when()
		.post(ADD_EMPLOYEE)
		.then()
		.assertThat()
		.statusCode(201)
		.and()
		.body("msg", Matchers.equalTo(expectedMessage))
		.spec(resSpecObject);
		
	}
}

