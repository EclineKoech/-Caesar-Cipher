package modules;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecryptTest {
  @Test
  public void encryptDecryptClassExists() {
    Encrypt encryptDecrypt = new Encrypt();
    assertEquals(true,encryptDecrypt instanceof Encrypt);
  }

  @Test
  public void encryptsCharacter(){
    Encrypt encryptDecrypt = new Encrypt();
    assertEquals("a",encryptDecrypt.Encrypt(1,"b"));
  }

  @Test
  public void encryptsSentence() {
    Encrypt encryptDecrypt = new Encrypt();
    assertEquals("dog", encryptDecrypt.Encrypt(2, "fqi"));
  }
}
