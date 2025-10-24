package practice_Serialization_Concept;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NFSGame implements Serializable{
	String name;
	int level;
	long score;
	int life;
	public NFSGame(String name, int level, long score, int life) {
		super();
		this.name = name;
		this.level = level;
		this.score = score;
		this.life = life;
	}
}
public class PraticeSerializationOnNFSGame {
	public static void main(String[] args) throws Throwable {
		NFSGame user1Obj = new NFSGame("saiteja", 11, 60000, 1);
		FileOutputStream fout = new FileOutputStream("./f.txt");
		ObjectOutputStream oops = new ObjectOutputStream(fout);
		oops.writeObject(user1Obj);
		System.out.println("=======End=======");
	}
}
