import java.util.Scanner;

public class Validate {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter number 1 = ");
        int num1 = getNumbers();
        printMenu();
        char operation = getOperation();
        System.out.print("Input second number:  ");
        System.out.println(" ");
        System.out.println("Enter number 2 = ");
        int num2 = getNumbers();
        switch (operation) {
            case '+':
                System.out.println("Result your operation = " + adding(num1, num2));
                break;
            case '-':
                System.out.println("Result your operation = " + subtraction(num1, num2));
                break;
            case '*':
                System.out.println("Result your operation = " + multiplication(num1, num2));
                break;
            case '/':
                System.out.println("Result your operation = " + division(num1, num2));
                break;
            default:
                System.out.println("Operation Unknown");
        }

    }

    public static int getNumbers(){
        int num = 0;
        for (int i = 0; i <= 1; i++) {
            if (!input.hasNextInt()) {
                System.out.println("Ints not a number");
                input.next();
                i--;
            } else if (input.hasNextInt()) {
                num = input.nextInt();
                break;
            }

        }
        return num;
    }

    public static char getOperation(){
        char operation;
        boolean repeat = false;
        do{
            if(repeat){
                System.out.println(" You make a mistake in input operation. Try Again");
                repeat = false;
            }
            System.out.println(" ");
            System.out.print(" Enter one of operation:  ");
            operation = input.next().charAt(0);
            repeat = true;

        }while(!checkOperation(operation));
        return operation;
    }


    public static boolean checkOperation(char operation){
        switch (operation){
            case '+':
            case'-':
            case'*':
            case '/':
                return true;
            case '5':
                System.exit(0);
            default:
                System.out.println("Not recognize operation");
                return false;
        }
    }

    public static void printMenu(){
        System.out.println("1.Adding         [+]");
        System.out.println("2.Subtraction    [-]");
        System.out.println("3.Multiplication [*]");
        System.out.println("4.Division       [/]");
        System.out.println("5. Exit");
    }

    public static int adding(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;

    }

    public static int subtraction(int num1, int num2){
        int result;
        result = num1-num2;
        return result;

    }
    public static int multiplication(int num1, int num2){
        int result;
        result = num1+num2;
        return result;
    }

    public static int division(int num1,int num2){
        int result;
        if(num2 == 0){
            num2 = 1;
        }
        result = num1/num2;
        return result;

    }


    
}
