package practice_JACKSON_Annotations;

import java.io.FileOutputStream;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
@JsonPropertyOrder(value= {"createdBy","projectName","status","teamSize"
})
class Project{
	private String projectName;
	private String createdBy;
	private int teamSize;
	private String status;
	public Project() {}
	public Project(String projectName, String createdBy, int teamSize, String status) {
		super();
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

public class PracticeJSONPropertyOrderAnnotation {
		public static void main(String[] args) throws Throwable {
			Project project1 = new Project("Project1", "saiteja", 0, "created");
			FileOutputStream fout = new FileOutputStream("./jsonFile1.json");
			ObjectMapper om = new ObjectMapper();
			om.writeValue(fout, project1);
		}
}
