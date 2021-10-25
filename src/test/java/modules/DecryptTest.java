package modules;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecryptTest {
  @Test
  public void decryptEncryptClassExists() {
    Decrypt decryptEncrypt = new Decrypt();
    assertEquals(true,decryptEncrypt instanceof Decrypt);
  }

  @Test
  public void decryptsCharacter(){
    Decrypt decryptEncrypt = new Decrypt();
    assertEquals("z",decryptEncrypt.Decrypt(1, "x"));
  }

  @Test
  public void encryptsSentence() {
    Encrypt encryptDecrypt = new Encrypt();
    assertEquals("dog", encryptDecrypt.Encrypt(2, "bme"));
  }
}
