public class datatype {
    public static void main(String[] args) {
        // data types
        //primitive data types
        System.out.println("Primitive data types");
        //byte - 8 bit(1 byte) [-128 to 127]
        byte mybyte = 117;
        System.out.println("byte data type : " + mybyte);

        //short - 16 bit(2 byte) [-32,768 to 32,767]
        short myshort = 23456;
        System.out.println("short data type : " + myshort);

        //int - 32 bit(4 byte) [-2,147,483,648 to 2,147,483,647]
        int myint = 123456789;
        System.out.println("int data type : " + myint);

        //long - 64 bit(8 byte) [-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807]
        long mylong = 652890167346789017L;
        System.out.println("long data type : " + mylong);

        //float - 32 bit(4 byte) [-3.4E +/- 38 to 3.4E +/- 38] (7 digits) (4 decimal places) 
        float myfloat = 456.1455f;
        System.out.println("float data type : " + myfloat);

        //double - 64 bit(8 byte) [-1.7E +/- 308 to 1.7E +/- 308] (15 digits) (7 decimal places)
        double mydouble = 455676.1455123;
        System.out.println("double data type : " + mydouble);

        //char - 16 bit(2 byte) [0 to 65,535] (Unicode)
        char mychar = 'A';
        System.out.println("char data type : " + mychar);

        //boolean - true or false (1 bit) 
        boolean myboolean = true;
        System.out.println("boolean data type : " + myboolean);

        // non-primitive data types
        //String - sequence of characters
        System.out.println(" ");
        System.out.println("Non primitive data types");
        String mystring = "Java Tutorial";
        System.out.println("string data type : " + mystring);
        System.out.println("length of string : " + mystring.length());

    }
}

/*
Primitive data types
byte data type : 117
short data type : 23456
int data type : 123456789
long data type : 652890167346789017
float data type : 456.1455
double data type : 455676.1455123
char data type : A
boolean data type : true

Non primitive data types
string data type : Java Tutorial
length of string : 13
*/
