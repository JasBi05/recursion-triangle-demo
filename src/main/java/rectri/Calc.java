package rectri;

import java.util.Scanner;


public class Calc
{

    private Scanner scanner; 
    private String input;
    private Sierp sierp;


    public Calc()
    {
         scanner = new Scanner(System.in);
    }

    public void printWelcome()
    {

    System.out.println("Welcome!");
    System.out.println("Enter a Number to print out a sierpinski triangle (1) or Pascal's triangle (2)");

    }

    public void writeInput()
    {

    boolean validInput = false;

    while(!validInput){
      try {
        input = scanner.nextLine();
        validInput = checkString();
      } catch (NumberFormatException e) {
        System.err.println("Your input is not valid.");
        System.err.println(e.getStackTrace());
        System.out.println();
      }
    }
  }


    public boolean checkString()
    {
        if(input.equals("1"))
        {
            createSierp();
            return true;
            
        }
        if(input.equals("2"))
        {
            System.out.println("Object is created succesfully!");
            return true;
            //Verbindung zu Klasse Sier aufbauen  
        }
        else
            System.out.println("Try again!");
            return false;
    }


    
    private void createSierp()
    {
            sierp = new Sierp();

            System.out.println("Enter a number for the canva size.");
            System.out.println("First row and then column:");

            int n = scanner.nextInt();
            int m = scanner.nextInt();
            
            System.out.println("Enter a numbers for row, col and size:");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            int size = scanner.nextInt();
            
            sierp.createCanva(n, m);
            sierp.printTriangle(row,col,size);
            sierp.printCanvas();
    }
}