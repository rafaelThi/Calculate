public class Calculate {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[2]);

        switch (args[1]){
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
        if (x > y) {
            System.out.println(x - y);
        }
        System.out.println(y - x);
    }
    static void division(int x, int y){
        if (y == 0) {
            System.out.println("Nao e possivel dividir por Zero");
        }
        double result = x / y;
        System.out.println(result);
    }
    static void multiplication(int x, int y){
        System.out.println(x * y);
    }
}
