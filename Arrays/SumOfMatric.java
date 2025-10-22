import java.util.Scanner;
public class SumOfMatric {
    public static void main(String []ahr){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix1 = new int[rows][col];
        int[][] matrix2 = new int[rows][col];

        for(int i = 0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] SumOfMatric = new int[rows][col];
        for(int i = 0;i<rows;i++){
            for(int j=0;j<col;j++){
                SumOfMatric[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(SumOfMatric[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
