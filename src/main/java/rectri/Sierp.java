package rectri;

public class Sierp
{
    private char[][] canvas;


    public void createCanva(int n, int m)
    {
        //creates a canva and fills it with ''
        canvas = new char[n][m];
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
            /* The large triangle is divided into three smaller triangles:
            row = row → vertical position (going down = larger number)
            col = column → horizontal position (going right = larger number)

            (row, col, size/2) each smaller triangle is half the size of the entire triangle
            (row + size/2, col - size/2, size/2) this is the lower-left triangle
            (row + size/2, col + size/2, size/2) this is the lower-right triangle */
                
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

