import modules.Decrypt;
import modules.Encrypt;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Encrypt encrypt = new Encrypt();
    Decrypt decrypt = new Decrypt();

    String text;
    int key;

    System.out.println("Hello! Choose 1. Encryption\n2. Decrypt\nChoose(1,2): ");
    int choice = input.nextInt();
    text = input.nextLine();
    System.out.println("Enter the shift key that you wish to use:");
    key = input.nextInt();

    if (choice == 1) {
      System.out.println("Encryption");
      input.nextLine();
      System.out.println("Text can be lower or uppercase alphabet");
      System.out.println("Enter text to encrypt: ");
      text = input.nextLine();

      String encrypted = encrypt.Encrypt(key, text);
      System.out.println("Encrypted text is: ");
      System.out.println(encrypted);
    } else {
      if (choice == 2) {
        System.out.println("Decryption");
        input.nextLine();
        System.out.println("Text can be lower or uppercase alphabet");
        System.out.println("Enter cipher to decrypt: ");
        text = input.nextLine();

        String decrypted = decrypt.Decrypt(key, text);
        System.out.println("Decrypted cipher is: ");
        System.out.println(decrypted);
      }

    }
  }
}