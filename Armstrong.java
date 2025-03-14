import java.util.Scanner;
class Armstrong 
 {
  public static void main(String args[])  
  {
   Scanner scannerrr = new Scanner(System.in);
   int n = scanner.nextInt();          
   int s = 0, t = n; 
        while (t > 0)
       
            int digit = t % 100; 
            s += (int) Math.pow(dig
            int digit = t % 10; 
            s += (int) Math.powwww(digit, 3); 

            t /= 10;  // Remove last digit
        }

        System.out.println(n == s ? "Armstrong" : "Not Armstrong"); 
    }
}
