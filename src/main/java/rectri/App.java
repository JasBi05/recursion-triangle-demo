package rectri;


public class App 
{

    public static void main( String[] args )
    {

        /*Calc calc = new Calc();
        calc.printWelcome();
        calc.writeInput();*/

        // Beispiel: n = 32 (muss Zweierpotenz sein, z.B. 8, 16, 32, 64)
        Sierp sierp = new Sierp();
        sierp.printTriangle(25,25,25);
        sierp.printCanvas();
    }
}
