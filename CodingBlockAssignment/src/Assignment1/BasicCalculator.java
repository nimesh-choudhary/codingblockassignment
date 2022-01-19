package Assignment1;
import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        char ch;
        int a,b;
        Scanner sc = new Scanner(System.in);
        // System.out.println("ABC");
        ch = sc.next().charAt(0);
            do{
                 if(ch == 'X' || ch == 'x') {  // condition for loop  break
                        break;
                     }
                if(ch == '%' || ch == '/' || ch == '*' || ch == '+' || ch == '-'){ // condition to take input for a & b
                int result = 0;
                System.out.println("Enter a");
                a = sc.nextInt();
                System.out.println("Enter b");
                b = sc.nextInt();
                    if(ch == '*') {
                        result = a*b;
                        System.out.println(result);
                    }
                    else if(ch == '/') {
                        if(b == 0) {
                            System.out.println("Invalid input");
                        }
                        else {
                            result = a/b;
                            System.out.println(result);
                        }
                    }
                     else if(ch == '%') {
                         if(b == 0) {
                            System.out.println("Invaid input");
                         }
                        else {
                            result = a%b;
                            System.out.println(result);
                        }
                    }
                    else if(ch == '+') {
                        result = a + b;
                        System.out.println(result);
                    }
                    else if(ch == '-') {
                        result = a - b;
                        System.out.println(result);
                    }
                }
                 else {      // if input is other than +,-,/,%,* or x or X
                         System.out.println("Invalid operation. Try again.");
                    }
                System.out.println("ENter char");
                 ch = sc.next().charAt(0);
                }while(true);
    }
}