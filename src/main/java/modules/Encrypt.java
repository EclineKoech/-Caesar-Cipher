package modules;

public class Encrypt {
  private int key;
  private String text;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public String Encrypt(int key, String text) {
    this.key = key;
    this.text = text;

    String encryptedText = "";


    if (key == 0 && !text.isEmpty()) {
      encryptedText = this.text;
    } else if (text.isEmpty() && key >= 0 && key <= 25) {
      encryptedText = "No text to encrypt,Enter text";
    } else if ((text.isEmpty() || !text.isEmpty()) && (key < 0 || key > 25)) {
      encryptedText = "Key must be a number between 0 and 25";
    }

    char[] aCharacters = this.text.toCharArray();

    for (char character : aCharacters) {
      if (!text.isEmpty() && key >= 1 && key <= 25) {
        int valueOfChar = Character.valueOf(character) + key;
        char shifted = (char) valueOfChar;

        encryptedText += Character.toString(shifted);
      }
    }
    return encryptedText;
  }
}