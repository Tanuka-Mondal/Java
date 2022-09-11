public class two_d_array {
    public static void main(String[] args) {
        // 2D Array
        int[][] mat = new int[4][3];
        mat[0][0] = 1;
        mat[0][1] = 2;
        mat[0][2] = 3;
        mat[1][0] = 4;
        mat[1][1] = 5;
        mat[1][2] = 6;
        mat[2][0] = 7;
        mat[2][1] = 8;
        mat[2][2] = 9;
        mat[3][0] = 10;
        mat[3][1] = 11;
        mat[3][2] = 12;
        
        System.out.println("1st element: " + mat[0][0]);
        System.out.println("2nd element: " + mat[0][1]);
        System.out.println("3rd element: " + mat[0][2]);
        System.out.println("4th element: " + mat[1][0]);
        System.out.println("5th element: " + mat[1][1]);
        System.out.println("6th element: " + mat[1][2]);
        System.out.println("7th element: " + mat[2][0]);
        System.out.println("8th element: " + mat[2][1]);
        System.out.println("9th element: " + mat[2][2]);
        System.out.println(" ");
        System.out.println("2D Array length : " + mat.length);
        System.out.println(" ");
        System.out.println("2D Array values : ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println(mat[i][j]);
            }
        }

        int[][] mat2 = {{4,9,7},{1,5,3},{2,6,8},{12,56,90}};
        System.out.println(" ");
        System.out.println("new 2D Array values : ");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.println(mat2[i][j]);
            }
        }
    }
}

/*
1st element: 1
2nd element: 2
3rd element: 3
4th element: 4
5th element: 5
6th element: 6
7th element: 7
8th element: 8
9th element: 9

2D Array length : 4

2D Array values :
1
2
3
4
5
6
7
8
9
10
11
12

new 2D Array values :
4
9
7
1
5
3
2
6
8
12
56
90
*/
