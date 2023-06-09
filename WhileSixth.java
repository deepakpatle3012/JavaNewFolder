import java.util.Scanner;
public class WhileSixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=1,sum = 0;
        while (i<=n) {
            if (i%2==1) {
                sum+=i;
            }
            
         i++;
        }System.out.println(sum);
    }
}
