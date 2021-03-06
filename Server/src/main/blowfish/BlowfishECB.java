package main.blowfish;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class BlowfishECB extends BlowfishBase {

	public BlowfishECB(String mode) throws Exception {
		super();
		
		SecretKeySpec keySpec = new SecretKeySpec(key, "Blowfish");
		
		cipher = Cipher.getInstance(mode);
		cipher.init(Cipher.ENCRYPT_MODE, keySpec);
	}

}
