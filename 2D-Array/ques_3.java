/*Write a program to find Transpose of a Matrix.What is Transpose?
Transpose of a matrix is the process of swapping the rows to columns.
    For a 2X3 matrix;
Matrix-
a11 a12 a13
a21 a22 a23

Transpose-
a11 a21
a12 a22
a13 a23
*/

public class ques_3{
    public static void printMatrix(int Matrix[][]){
        System.out.println("The Matrix is: ");
        for(int i = 0; i < Matrix.length; i++){
            for(int j = 0; j < Matrix[0].length; j++){
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] Matrix = {{1,4,9},{2,2,3}};
        int row = 2 , column = 3;

        //Display original matrix
        printMatrix(Matrix);

        //Transpose the matrix
        int[][] Transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++){
                Transpose[j][i] = Matrix[i][j];
            }
        }

        printMatrix(Transpose);
    }
}