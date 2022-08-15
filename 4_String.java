public class mystring {
    public static void main(String[] args) {
        // String
        String fname = "Tanuka";
        String lname = "Mondal";
        System.out.println("first name : " + fname);
        System.out.println("last name : " + lname);
        String name = fname + " " + lname; // concatenation
        System.out.println("full name : " + name);

        System.out.println("char at index 0 : " + name.charAt(0)); // char at index 0

        System.out.println("length of name : " + name.length()); // length of name

        String name2 = name.replace("Tanuka", "Tinni"); // replace
        System.out.println("new name : " + name2);

        System.out.println("Substring: " + name.substring(0, 4)); // substring

        System.out.println("toUpperCase : " + name.toUpperCase()); // toUpperCase

        System.out.println("toLowerCase : " + name.toLowerCase()); // toLowerCase

        System.out.println("trim : " + name.trim()); // trim (remove white spaces)

        System.out.println("index of : " + name.indexOf("a")); // index of

        System.out.println("last index of : " + name.lastIndexOf("a")); // last index of

        System.out.println("replace : " + name.replace("a", "e")); // replace

        System.out.println("split : " + name.split(" ")); // split

        System.out.println("replace all : " + name.replaceAll("a", "e")); // replace all

        System.out.println("replace first : " + name.replaceFirst("a", "e")); // replace first

        System.out.println("replace last : " + name.replaceFirst("a", "e")); // replace last

        System.out.println("concat : " + name.concat(" " + "Tinni")); // concat
        
}

}

/*
first name : Tanuka
last name : Mondal
full name : Tanuka Mondal
char at index 0 : T
length of name : 13
new name : Tinni Mondal
Substring: Tanu
toUpperCase : TANUKA MONDAL
toLowerCase : tanuka mondal
trim : Tanuka Mondal
index of : 1
last index of : 11
replace : Tenuke Mondel
split : [Ljava.lang.String;@13221655
replace all : Tenuke Mondel
replace first : Tenuka Mondal
replace last : Tenuka Mondal
concat : Tanuka Mondal Tinni
*/
