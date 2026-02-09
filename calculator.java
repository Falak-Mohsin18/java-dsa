
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from user till user does not print X or x
        while (true) {
            //take operator as input
            char op = in.next().trim().charAt(0);
            if(op=='+'|| op=='-'|| op=='*'|| op=='/'){
                System.out.println("Enter two numbers:");
                int a = in.nextInt();
                int b = in.nextInt();
                switch (op) {
                    case '+':
                        System.out.println("The sum is: " + (a + b));
                        break;
                    case '-':
                        System.out.println("The difference is: " + (a - b));
                        break;
                    case '*':
                        System.out.println("The product is: " + (a * b));
                        break;
                    case '/':
                        if (b != 0) {
                            System.out.println("The quotient is: " + (a / b));
                        } else {
                            System.out.println("Cannot divide by zero");
                        }
                        break;
                }
            } else if(op=='X' || op=='x'){
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            } else {
                System.out.println("Invalid operator. Please enter +, -, *, / or X to exit.");
            }
        }
    }
}
