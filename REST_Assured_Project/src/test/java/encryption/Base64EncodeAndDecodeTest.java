package encryption;

import java.util.Base64;

import org.testng.annotations.Test;

public class Base64EncodeAndDecodeTest {
	@Test
	public void base64EncryptionTest() {
		String encoded = new String(Base64.getEncoder().encode("rmgyantra:rmgy@9999".getBytes()));
		System.out.println(encoded);
		String decoded = new String(Base64.getDecoder().decode(encoded.getBytes()));
		System.out.println(decoded);
		} 
}
