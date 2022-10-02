import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine() );
        String operation = scanner.nextLine();
        int number2 = Integer.parseInt(scanner.nextLine());

        switch (operation){
            case "+":
                sum(number1, number2);
                break;
            case "-":
                subtraction(number1, number2);
                break;
            case "*":
                multiplication(number1, number2);
                break;
            case "/":
                division(number1, number2);
                break;
            default:
                System.out.println("'" + args[0] + "' Operacao invalida, tente de novo");
        }
    }

    static void sum(int x, int y){
        System.out.println(x + y);
    }
    static void subtraction(int x, int y){
        if (x < y) {
            System.out.println(x - y);
            return;
        }
        System.out.println(y - x);
    }
    static void division(int x, int y){
        if (y == 0) {
            System.out.println("Nao e possivel dividir por Zero, tente novamente");
            return;
        }
        double result = x / y;
        System.out.println(result);
    }
    static void multiplication(int x, int y){
        System.out.println(x * y);
    }
}
