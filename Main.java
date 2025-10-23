import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input a Word and target: ");
    String word = sc.nextLine();
    int maxCount = 0;
    String maxLetter = "";
    String target = "";

    for (int i2 = 0; i2 < word.length(); i2++) {

    target = word.substring(i2, i2 + 1);
    int count = 0;

        for (int i = 0; i < word.length(); i++) {

          String currentLetter = word.substring(i, i + 1);
            if (currentLetter.equals(target))
            {
              count++;
            }
    }
    if (count > maxCount) {
      maxCount = count;
      maxLetter = target;
    }
    }
    System.out.println("The letter " + maxLetter + " appears the most amount of times.");
  }
}
