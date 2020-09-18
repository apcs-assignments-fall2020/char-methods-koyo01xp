import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if((ch >= 65) && (ch <= 90)) {
            return (char)(ch+32);
        }
        else {
            return ch;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String store = "";
        char a = 0;
        for (int i = 0;i < str.length();i++){
            if ((str.charAt(i) >= 65) && (str.charAt(i) <= 90)) {
                a = str.charAt(i);
                a += 32;
                store = store + (char)a;
            }
            else {
                store = store + str.charAt(i);
            }
        }
        return store;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if((ch >= 97) && (ch <= 122)) {
            return (char)(ch-32);
        }
        else {
            return ch;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String store = "";
        char a = 0;
        for (int i = 0;i < str.length();i++){
            if ((str.charAt(i) >= 97) &&(str.charAt(i) <= 122) ) {
                a = str.charAt(i);
                a -= 32;
                store = store + (char)a;
            }
            else {
                store = store + str.charAt(i);
            }
        }
        return store;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String");
        String abc = scan.nextLine();
        System.out.println(abc);
        System.out.println("What would you like to make your string lowercase or uppercase?");
        String def = scan.nextLine();
        System.out.println(def);
        if (def.equals("lowercase")) {
            System.out.println("Here is your string in lowercase: " + myToLowerCase(abc));    
        }
        else if (def.equals("uppercase")) {
            System.out.println("Here is your string in uppercase: " + myToUpperCase(abc));
        }
        
        scan.close();
        
    }
}
