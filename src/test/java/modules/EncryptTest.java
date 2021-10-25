package modules;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EncryptTest {

  @Test
  public void encryptDecryptClassExists() {
    Encrypt encryptDecrypt = new Encrypt();
    assertEquals(true,encryptDecrypt instanceof Encrypt);
  }

  @Test
  public void encryptsCharacter(){
    Encrypt encryptDecrypt = new Encrypt();
    assertEquals("b",encryptDecrypt.Encrypt(1,"a"));
  }

  @Test
  public void encryptsSentence() {
    Encrypt encryptDecrypt = new Encrypt();
    assertEquals("fqi", encryptDecrypt.Encrypt(2, "dog"));
  }
}