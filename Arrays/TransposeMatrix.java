import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[][] arr = new int[n1][n1];
        for(int i = 0;i<n1;i++){
            for(int j=0;j<n1;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] arrTran = new int[n1][n1];
        for (int i = 0; i < n1; i++) {
            for(int j=0;j<n1;j++){
                arrTran[j][i] = arr[i][j];
            }
            
        }

        for (int i = 0; i < n1; i++) {
            for(int j=0;j<n1;j++){
                System.out.print(arrTran[i][j]+" ");
            }
            System.out.println();
            
        }
    }
}

// public class Solution {
//     public int[][] solve(int[][] A) {
//         int[][] trans = new int[A[0].length][A.length];
//         for(int i = 0;i<A.length;i++){
//             for(int j = 0;j<A[0].length;j++){
//                 trans[j][i]=A[i][j];
//             }
//         }
//         return trans;
//     }
// }