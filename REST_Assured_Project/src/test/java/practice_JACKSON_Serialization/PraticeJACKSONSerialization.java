package practice_JACKSON_Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.fasterxml.jackson.databind.ObjectMapper;

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
public class PraticeJACKSONSerialization {
	public static void main(String[] args) throws Throwable {
		Project project1 = new Project("Project1", "saiteja", 0, "created");
		FileOutputStream fout = new FileOutputStream("./jsonFile.json");
		ObjectMapper om = new ObjectMapper();
		om.writeValue(fout, project1);
	}
}
