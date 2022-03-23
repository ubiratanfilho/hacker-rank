import java.util.*;
import java.io.*;
import java.lang.*;

class LoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int out = 0;

            
            out = a + b;
            System.out.printf("%d ", out);
            for (int j = 1; j < n; j++) {
                out += Math.pow(2, j) * b;
                System.out.printf("%d ", out);
            }
            System.out.println();
        }

        
        in.close();
    }
}