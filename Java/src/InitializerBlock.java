import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InitializerBlock {

    // Write your code here
    public static Scanner scan = new Scanner(System.in);
    public static int b = scan.nextInt();
    public static int h = scan.nextInt();

    public static void main(String[] args){
        if (b > 0 && h > 0){
            System.out.println(b*h);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
            
            
        }//end of main

}//end of class
