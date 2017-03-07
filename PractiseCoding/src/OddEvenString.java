import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OddEvenString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        @SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
      //  Scanner stdOut =  new Scanner((Readable) System.out);
        int T = stdIn.nextInt();
        if(T<1 && T>10){
           System.out.println("Invalid T, it should be between 1 and 10 inclusive");
        }
        else{
           for(int j=0;j<=T-1;j++){
        	   
               char[] c1= stdIn.next().toCharArray();
               StringBuilder s1 = new StringBuilder();
               StringBuilder s2 = new StringBuilder();
                
               if(c1.length<2 && c1.length>10000){
                   System.out.println("Length of string should be between 2 and 10K inclusive");
                   break;
               }
               for(int i=0;(i<c1.length);i++){
            	   if(i%2==0){
            		   s1.append(c1[i]);
            	   }
            	   else
            		   s2.append(c1[i]);
               }
               System.out.println(s1+" "+s2);
           }    
        }
        stdIn.close();
        
    }
}