import java.sql.SQLOutput;
import java.util.Scanner;

public class ShuyiJLib {
    public static void main(String [] args)
    {
        Scanner level = new Scanner(System.in);
        System.out.println("What your name?");
        String userName = level.nextLine();
        System.out.println("Select Level");
        int levelInt = level.nextInt();
        System.out.println(userName + " "+"you have selected" + " " +"level" + " " + levelInt);
        if(levelInt ==1 )
        {
           levelInt = 10;
        }
        if(levelInt ==2 )
        {
            levelInt= 100;
        }
        if(levelInt ==3 )
        {
            levelInt = 1000;
        }
        if(levelInt ==4 )
        {
            levelInt= 10000;
        }

        System.out.println("Now Guess what the number is");
        double randomInt = Math.random()*levelInt;
        int guessNum = level.nextInt();
        int randomInt1 = (int)randomInt;
        while(guessNum != randomInt)
        {
            if (guessNum == randomInt1)
            {
                System.out.println( userName + " "+ "You Won");
            }
            else if (guessNum < randomInt1)
            {
                System.out.println("it higher");
            }
            else if (guessNum > randomInt1)
            {
                System.out.println("it lower");
            }
            guessNum = level.nextInt();
        }
    }

}
