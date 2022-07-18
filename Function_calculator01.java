import java.util.*;

public class Mycal {
    static void printline()
    {
        System.out.println("-------------*-----------------*----------------*---------------*------------");
    }
    static int factorial(int f) {
        int fact = 1;
        for (int i = 2; i <= f; i++) {
            fact *= i;
        }
        return fact;
    }

    static int cal(int x, int y, char operator) {
        return switch (operator) {
            case '+' -> (x + y);
            case '-' -> (x - y);
            case '*' -> (x * y);
            case '/' -> (x / y);
            default -> 0;
        };



    }
    //Fibonacci series:
    static void Fibonacci_no (int ff)
    {

        int  a=1, s=0, z=0 , count = 1;
        while (count<ff)
        {
            System.out.print(z+ " ");
            z=a+s;
            a=s;
            s=z;
            count++;
        }
    }
// Main method start
    public static void main(String[] args) {

        Scanner sin = new Scanner(System.in);

        int a ;
        int b ;
        int c;
        int fi;
        double root;     //variable declaration
        while_loop:
while(true) {
    printline();
    System.out.println("Enter Task [1] calculator: [2] factorial: [3] Fibonacci series: [4] square root ...[5] stop the program");
    printline();

    int task = sin.nextInt();

    switch (task) {
        case 1 -> {
            System.out.println("Enter first_no: ");
            a = sin.nextInt();
            System.out.println("Enter second_no: ");
            b = sin.nextInt();
            System.out.println("Enter the Operator[+,-,*,/]");
            char op = sin.next().charAt(0);
            int result2 = cal(a, b, op);
            if (op == '+' || op == '-' || op == '*' || op == '/') {

                System.out.println(a +" " + op +" "+ b + "= " + result2 );

            } else {
                System.out.println("invalid operator!..please select [+,-,*,/] or function");
            }
        }
        case 2 -> {
            System.out.println("Enter factorial number: ");
            c = sin.nextInt();
            int result2 = factorial(c);
            System.out.println(" " + c + " factorial number is: " + result2);
        }
        case 3 -> {
            System.out.println("how many Fibonacci series number: ");
            fi = sin.nextInt();
            Fibonacci_no(fi);
        }
        case 4 -> {
            System.out.println("enter root number");
            root = sin.nextInt();
            System.out.println(root + " square Root value is: " + Math.sqrt(root));
        }
        case 5->{ break while_loop;
        }
        default -> System.out.println("please enter your task[1,2,3]");
    }
}





    }
}
