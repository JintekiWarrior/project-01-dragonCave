import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        StoryGame storyGame = new StoryGame();

        System.out.println(storyGame.storyStart());

        int num = 0;
        try
        {
            num = myScanner.nextInt();
        } catch (Exception err)
        {
            System.out.println(err.getClass().getName());
        }

        System.out.println(storyGame.chooseEnding(num));
    }
}
