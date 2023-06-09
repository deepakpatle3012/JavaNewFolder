import java.util.Scanner;
public class ProblemThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b, sum = 0;
        System.out.print("Enter number");
         int v =sc.nextInt();

         for(int i = 1; i <= v; i++)
         {
            for(int n=i;0<n;)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}
