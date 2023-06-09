import java.util.Scanner;

import javax.script.ScriptContext;
public class ProblemSixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        int count =0;
        for (int i = 1; i <=Math.sqrt(number); i++) {
          if (number % i == 0) {
              int f = number/i;
               if (i==f) 
               count=count+1;
               else count=count+2;}
               }
         System.out.println(count);/* */
    
    }
}
    