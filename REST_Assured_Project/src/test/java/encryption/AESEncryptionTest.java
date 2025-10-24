package encryption;

import org.testng.annotations.Test;

import static encryptionOfDataByAES.AESEncryptionAndDecryption.*;

public class AESEncryptionTest {
	@Test
	public void sampleTest() throws Throwable {
		String privateKey="Ac03tEam@j!tu_#1";
		String data ="{\r\n"
				+ "   \"name\":\"saiteja\",\r\n"
				+ "   \"age\":20\r\n"
				+ "}\r\n"
				+ "";
		String encryptedData = encrypt(data, privateKey);
		System.out.println(encryptedData);
		String decryptedData=decrypt(encryptedData,privateKey);
		System.out.println(decryptedData);
	}
}
