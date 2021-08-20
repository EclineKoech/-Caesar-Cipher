import java.util.Scanner;

class Main {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    String text;
    int key;

    System.out.println("Hello! Enter text you want to Encrypt:");
    text = input.nextLine();
    System.out.println("Enter the shift key that you wish to use:");
    key = input.nextInt();

    System.out.println("text:" + key);
  }
}