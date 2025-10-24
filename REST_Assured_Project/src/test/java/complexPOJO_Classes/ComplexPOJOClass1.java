package complexPOJO_Classes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
class ProjectManager{
	private String name;
	private String ID;
	public ProjectManager(String name, String iD) {
		super();
		this.name = name;
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
}
@JsonPropertyOrder(value= {
		"ProjectName","ProjectStatus","teamMembers","projectManager"
})
class Project{
	private String ProjectName;
	private String ProjectStatus;
	private List<String> teamMembers;
	private List<ProjectManager> projectManager;
	public Project(String projectName, String projectStatus, List<String> teamMembers,
			List<ProjectManager> projectManager) {
		super();
		ProjectName = projectName;
		ProjectStatus = projectStatus;
		this.teamMembers = teamMembers;
		this.projectManager = projectManager;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public String getProjectStatus() {
		return ProjectStatus;
	}
	public void setProjectStatus(String projectStatus) {
		ProjectStatus = projectStatus;
	}
	public List<String> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(List<String> teamMembers) {
		this.teamMembers = teamMembers;
	}
	public List<ProjectManager> getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(List<ProjectManager> projectManager) {
		this.projectManager = projectManager;
	}
	
	
}
public class ComplexPOJOClass1 {
		public static void main(String[] args) throws Throwable {
			List<String> emps = new ArrayList<String>();
			emps.add("sai");
			emps.add("teja");
			emps.add("ram");
			List<ProjectManager> pms = new ArrayList<ProjectManager>();
			pms.add(new ProjectManager("saiteja", "FFE667"));
			pms.add(new ProjectManager("harika", "FFE668"));
			Project p = new Project("saitejaProject", "Created",emps, pms);
			FileOutputStream fos = new FileOutputStream("./complexPOJO2.json");
			ObjectMapper om = new ObjectMapper();
			om.writeValue(fos, p);
		}
}
