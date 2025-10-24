package com.ninza.HRM.projects;

import java.io.IOException;
import java.sql.SQLException;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.ninza.HRM.BaseAPIClass.BaseAPIClass;
import POJO.util.PojoClass1;
import static iEndPoints.IEndPoint.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class addAProjectWithValidData extends BaseAPIClass{
	PojoClass1 project;
	String BaseURI;

	@Test
	public void addProject() throws ClassNotFoundException, SQLException, IOException {
		String expectedMsg =  "Successfully Added";
		BaseURI = flib.getValueFromPropertiesFile("BASEUri");
		String projectName = "ninza_"+jlib.getRandomNumber();
		project = new PojoClass1("User_"+jlib.getRandomNumber(), projectName, "Created", 0);
		Response resp=given()
				.spec(reqSpecObject)
				.body(project)
				.when()
				.post(ADD_PROJECT);
			resp.then()
				.assertThat()
				.statusCode(201)
				.and()
				.body("msg", Matchers.equalTo(expectedMsg))
				.and()
				.time(Matchers.lessThan(3000l))
				.spec(resSpecObject);
			System.out.println(projectName+" project created");
	}
	
	@Test(dependsOnMethods = "addProject")
	public void addProjectWithDuplicateProjectName() {
		Response resp=given()
				.spec(reqSpecObject)
				.body(project)
				.when()
				.post(ADD_PROJECT);
			resp.then()
				.assertThat()
				.statusCode(409)
				.spec(resSpecObject);
			System.out.println("duplicate project can't be created");
	}

	
}
