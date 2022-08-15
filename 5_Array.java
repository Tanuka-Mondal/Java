import java.util.Arrays;

public class myarray {
    public static void main(String[] args) {
        // Array
        int[] point = new int[5];
        point[0] = 9;
        point[1] = 7;
        point[2] = 4;
        point[3] = 1;
        point[4] = 5;
        System.out.println("1st element: " + point[0]);
        System.out.println("2nd element: " + point[1]);
        System.out.println("3rd element: " + point[2]);
        System.out.println("4th element: " + point[3]);
        System.out.println("5th element: " + point[4]);
        System.out.println(" ");
      
/*
1st element: 9
2nd element: 7
3rd element: 4
4th element: 1
5th element: 5
*/
        System.out.println("Array length : " + point.length);
// Array length : 5      
      
        System.out.println(" ");
        System.out.println("Array values : ");
        for (int i = 0; i < point.length; i++) {
            System.out.println(point[i]);
        }
/*
Array values :
9
7
4
1
5
*/
       
        int[] marks = new int[10];
        System.out.println(" ");
        System.out.println("integers array : ");
        System.out.println("0th index  " + marks[0]); // by default 0

        char[] chararr = new char[5];
        System.out.println(" ");
        System.out.println("characters array : ");
        System.out.println("0th index  " + chararr[0]); 

        boolean[] boolarr = new boolean[5];
        System.out.println(" ");
        System.out.println("booleans array : ");
        System.out.println("0th index  " + boolarr[0]); // by default false
/*
integers array :
0th index  0

characters array :
0th index

booleans array :
0th index  false
*/

        int[] point2 = {10,20,30,40,50,60};
        System.out.println(" ");
        System.out.println("New Array values : ");
        for (int i = 0; i < point2.length; i++) {
            System.out.println(point2[i]);
        }
      
/*
New Array values :
10
20
30
40
50
60
*/
        
        //sort array -- for this java.util.Arrays imported
        System.out.println(" ");
        System.out.println("Sorted Array : ");
        Arrays.sort(point);
        for (int i = 0; i < point.length; i++) {
            System.out.println(point[i]);
        }
      
/*
Sorted Array :
1
4
5
7
9
*/
}

}
