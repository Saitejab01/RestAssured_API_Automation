package practice_Serialization_Concept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PraticeDeSerializationOnNFSGame {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./f.txt");
		ObjectInputStream oips = new ObjectInputStream(fis);
		Object game = oips.readObject();
		NFSGame game1 = (NFSGame) game;
		System.out.println(game1.level);
		System.out.println(game1.life);
		System.out.println(game1.score);
		System.out.println(game1.name);
	}
}
