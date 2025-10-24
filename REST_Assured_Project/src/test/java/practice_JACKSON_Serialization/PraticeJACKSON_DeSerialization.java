package practice_JACKSON_Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PraticeJACKSON_DeSerialization {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./jsonFile.json");
		ObjectMapper om = new ObjectMapper();
		Project p1=om.readValue(fis, Project.class);
		System.out.println(p1.getProjectName());
		System.out.println(p1.getCreatedBy());
		System.out.println(p1.getTeamSize());
		System.out.println(p1.getStatus());
	}
}
