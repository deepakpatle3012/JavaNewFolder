import java.util.Scanner;

public class WhileFourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numer");
        int num = sc.nextInt();
        int i=1;
        int sum =0;
        while (i<= 10) {
          System.out.println( num+" * "+i+" = "+i*num);
            i++;
        }
    }
}

