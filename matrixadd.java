import java.util.Scanner;

class matrixadd// (File name should be the same as class name)
{
    public static void main(String arg[]) {
        int[][] mat1 = new int[50][50];
        int[][] mat2 = new int[50][50];
        int[][] mat3 = new int[50][50]; // For storing addition result
        int m, n, p, q, i, j;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the order of the first matrix (rows, columns):");
        m = sc.nextInt();
        n = sc.nextInt();

        System.out.println("Enter the order of the second matrix (rows, columns):");
        p = sc.nextInt();
        q = sc.nextInt();

        // Check if addition is possible
        if (m == p && n == q) {
            System.out.println("Enter the elements of the first matrix (row-wise):");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    mat1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the elements of the second matrix (row-wise):");
            for (i = 0; i < p; i++) {
                for (j = 0; j < q; j++) {
                    mat2[i][j] = sc.nextInt();
                }
            }

            // Matrix addition logic
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    mat3[i][j] = mat1[i][j] + mat2[i][j];
                }
            }

            // Display first matrix
            System.out.println("\n\nFirst Matrix:");
            System.out.println("-----------------");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print(mat1[i][j] + "\t");
                }
                System.out.println();
            }

            // Display second matrix
            System.out.println("\n\nSecond Matrix:");
            System.out.println("-----------------");
            for (i = 0; i < p; i++) {
                for (j = 0; j < q; j++) {
                    System.out.print(mat2[i][j] + "\t");
                }
                System.out.println();
            }

            // Display resulting matrix
            System.out.println("\n\nMatrix Addition Result:");
            System.out.println("-----------------");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print(mat3[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix addition is not possible! Dimensions must match.");
        }
    }
}
