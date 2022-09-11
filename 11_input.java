import java.util.Scanner;
public class myinput {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Input the cost: ");
        int cost = a.nextInt();
        System.out.println("The cost is " + cost);

        Scanner b = new Scanner(System.in);
        System.out.println("Input the name: ");
        String name = b.nextLine();
        System.out.println("The name is " + name);

        Scanner c = new Scanner(System.in);
        System.out.println("Input the value: ");
        float value = c.nextFloat();
        System.out.println("The value is " + value);

    }
}

/*
Input the cost: 
56
The cost is 56
Input the name:
Tinni
The name is Tinni
Input the value:
45.9
The value is 45.9
*/
