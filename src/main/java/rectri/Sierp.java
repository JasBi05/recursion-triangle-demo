package rectri;

public class Sierp
{
    private char[][] canvas;


    public Sierp()
    {
        canvas = new char[50][50];
         for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
            canvas[i][j] = ' ';
            }
        }
    }

    public void printTriangle(int row, int col, int size)
    {
        if(size == 1)
        {
            canvas[row][col] = '*';
        }
        else
        {
            printTriangle(row, col, size/2);
            printTriangle(row + size/2, col - size/2, size/2);
            printTriangle(row + size/2, col + size/2, size/2);
        }
    }

    public void printCanvas() {
    for (int i = 0; i < canvas.length; i++) {
        for (int j = 0; j < canvas[i].length; j++) {
            System.out.print(canvas[i][j]);
        }
        System.out.println();
    }
  }
}

