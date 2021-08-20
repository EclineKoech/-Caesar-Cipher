package modules;

public class Decrypt {
  private int key;
  private String cipher;

  public String getCipher() {
    return cipher;
  }

  public void setCipher(String cipher) {
    this.cipher = cipher;
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public String Decrypt(int key, String text) {
    this.key = key;
    this.cipher = text;

    String decryptedText = "";


    if (key == 0 && !text.isEmpty()) {
      decryptedText = this.cipher;
    } else if (text.isEmpty() && key >= 0 && key <= 25) {
      decryptedText = "No text to encrypt,Enter text";
    } else if ((text.isEmpty() || !text.isEmpty()) && (key < 0 || key > 25)) {
      decryptedText = "Key must be a number between 0 and 25";
    }

    char[] aCharacters = this.cipher.toCharArray();

    for (char character : aCharacters) {
      if (!text.isEmpty() && key >= 1 && key <= 25) {
        int valueOfChar = Character.valueOf(character) - key;
        char shifted = (char) valueOfChar;

        decryptedText += Character.toString(shifted);
      }
    }
    return decryptedText;
  }
}

