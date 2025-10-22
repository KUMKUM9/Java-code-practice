import java.util.Scanner;
public class ColumnPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix1 = new int[rows][col];

        for(int i = 0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
