import java.sql.SQLOutput;
import java.util.Scanner;

public class ShuyiJLib {
    public static void main(String [] args)
    {
        System.out.println("Select Level");
        Scanner level = new Scanner(System.in);
        int levelInt = level.nextInt();
        System.out.println("you have selected" + "" + levelInt);
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
                System.out.println("You Won");
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
