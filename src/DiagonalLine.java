import java.util.Scanner;

public class DiagonalLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heightWidth;
        int diagonalLine = 0;
        System.out.println("Enter height and width :");
        heightWidth = sc.nextInt();
        double[][]square = new double[heightWidth][heightWidth];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.print("Enter element int row :"+(i+1));
                square[i][j] = sc.nextDouble();
            }
            System.out.println("\n");
        }

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.print(square[i][j]+"\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < square.length; i++) {
            diagonalLine +=square[i][i];
        }
        System.out.println(diagonalLine);
    }
}
