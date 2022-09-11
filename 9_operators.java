public class myoperators {
    public static void main(String[] args){
        //arithmatic operators
        int a = 5;
        int b = 10;
        int add = a + b;
        System.out.println(add); //15
        int sub = b - a;
        System.out.println(sub); //5
        int mult = a * b;
        System.out.println(mult); //50
        int div1 = a / b;
        System.out.println(div1);
        float div2 = (float)a / (float)b; //type casting 
        System.out.println(div2); //0.5
        int div3 = b / a;
        System.out.println(div3); //2
        int mod = a % b;
        System.out.println(mod); //5

        //unary operators
        int x = 5;
        x = x + 1;
        System.out.println(x); //6
        x++; //increment (unary operator)
        System.out.println(x); //7

        int y = 10;
        System.out.println(y++); //10
        System.out.println(y); //11
        System.out.println(++y); //12
        System.out.println(y); //12

        int z = 20;
        System.out.println(z--); //20
        System.out.println(z); //19
        System.out.println(--z); //18
        System.out.println(z); //18
    }
}
