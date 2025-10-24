package practice_JACKSON_Annotations;

import java.io.FileOutputStream;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
@JsonPropertyOrder(value= {"createdBy","projectName","status","teamSize"
})
@JsonIgnoreProperties(value= {
		"teamSize"
},allowSetters = true)
class Project2{
	private String projectName;
	private String createdBy;
	private int teamSize;
	private String status;
	public Project2() {}
	public Project2(String projectName, String createdBy, int teamSize, String status) {
		this.projectName = projectName;
		this.createdBy = createdBy;
		this.teamSize = teamSize;
		this.status = status;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	} 
}

public class PracticeJSONIgnorePropertiesAnnotation {
		public static void main(String[] args) throws Throwable {
			Project2 project1 = new Project2("Project1", "saiteja", 0, "created");
			FileOutputStream fout = new FileOutputStream("./jsonFile2.json");
			ObjectMapper om = new ObjectMapper();
			om.writeValue(fout, project1);
		}
}
