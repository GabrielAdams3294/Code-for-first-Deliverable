import java.util.Scanner;
import java.lang.Math;
public class Mines {
    public static void main(String args[]) throws InterruptedException {
        Scanner user = new Scanner(System.in);
       
        //Game loop
        while (true){
            //Setup
            System.out.print("Use W.A.S.D to move, search for the treasure. ");
            System.out.println();
            int found = 1;
            //resets player X & Y
            int X = 3;
            int Y = 3;
            //resets Treasure X & Y
            int Treasure_X = 1 + (int)(Math.random() * 5);
            int Treasure_Y = 1 + (int)(Math.random() * 5);
            //Resets Mine X & Y
            int Mine_X = 1 + (int)(Math.random() * 5);
            int Mine_Y = 1 + (int)(Math.random() * 5);
            System.out.print(Mine_X + ", " + Mine_Y);
            
            
            //Dev check, shows where the treasure is for testing purposes. Remove slashs to use.
            //System.out.print(Treasure_X + ", " + Treasure_Y);
            //System.out.println();

            printBoard(X, Y, found);
        
            while (true){
                //Taking user input
                String letter = user.next();
                if (letter.equals("q")){
                    break;
                //Checks to see what user wants
                }else if (letter.equals("w")){
                    //checks to see if moving there would move you off the board.
                    if (Y != 1){
                        Y = Y + -1;
                    }
                
                }else if (letter.equals("s")){
                    //checks to see if moving there would move you off the board
                    if (Y != 5){
                        Y = Y + 1;
                    }
                
                }else if (letter.equals("a")){
                    //checks to see if moving there would move you off the board
                    if (X != 1){
                        X = X - 1;
                    }
                
                }else if (letter.equals("d")){
                    //checks to see if moving there would move you off the board
                    if (X != 5){
                        X = X + 1;
                    }
               
                }
                //Checks to see if your on the treasure
                if (X == Treasure_X){
                    if (Y == Treasure_Y){
                        found = 2;
                        printBoard(X, Y, found);
                        animation(1);
                        animation(2);
                        animation(1);
                        animation(2);
                        printBoard(X, Y, found);
                        break;
                    }else;
                        printBoard(X, Y, found);
                }else;
                    printBoard(X, Y, found);

                if (X == Mine_X){
                    if (Y == Mine_Y){
                        found = 3;
                        printBoard(X, Y, found);
                        animation(3);
                        animation(2);
                        animation(3);
                        animation(2);
                        printBoard(X, Y, found);
                        break;
                    }else;
                        printBoard(X, Y, found);
                }else;
                    printBoard(X, Y, found);
                
            }
            //if q pressed:
            if (found == 1){
                System.out.println("You clicked to q to quit by accident :(");
            //if treasure found:
            }else if (found == 2){
                System.out.println("You Found buried treasure!!! Thanks for playing.");
            }else if (found  == 3){
                System.out.println("Did I forget to tell you there are mines? You got blown up BOOOOOOOOOM...   LOL");
                
            }
            //Checks to see if you want to continue playing:
            System.out.println("Press y to continue playing! or anything else to quite...");
            String new_game = user.next();
            if (new_game.equals("y")){
                System.out.println("");
                
            }else{
                break;
            }
        }
        //when the game ends.
        System.out.println("Thanks for playing! If you wish to play again press f5.");
    
    
    }
    public static void animation(int N) throws InterruptedException
    {
        if (N == 1){
            System.out.println("$ $ $ $ $ \n$ $ $ $ $ \n$ $ $ $ $ \n$ $ $ $ $ \n$ $ $ $ $ \n ");
            try{
            Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else if (N == 2){
            System.out.println("\n \n \n \n \n");
            try{
            Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else if (N == 3){
            System.out.println("");
            System.out.println("");
            System.out.println(" ( ͡° ͜ʖ ͡°) ");
            System.out.println("");
            System.out.println("");
            try{
            Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    


    }
    public static void printBoard(int X, int Y, int I)
    {
        //checks to see if chracter are not equal to 0
        
            // print each line.
        System.out.println("");
        for (int i = 0; i < 5; i++){
                // prints each character.
            for (int f = 0; f < 5; f++){
                    // checks to see if chracter needs to change on X axis.
                if (f == X - 1){
                        // checks for y axis
                    if (i == Y - 1){
                        if (I == 1){
                            System.out.print("X ");
                        }else if (I == 2){
                            System.out.print("$ ");
                        }else
                            System.out.print("B ");
                        
                    }else
                        System.out.print("* ");
                    }else
                    System.out.print("* ");
                

                
                    }
            System.out.println();
            }
    }
}

