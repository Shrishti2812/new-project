import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 public class Main {
    public static boolean isBinary(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%") || operator.equals("^");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        System.out.println(" Enter first number :");
        int num = sc.nextInt();


        while (true) {
            System.out.println(" Enter the operator");
            String operator = sc.next();
            if (operator.equals("=")) {

                break;
            }
        if (isBinary(operator)) {
                System.out.println(" Enter second number :");
                int num2 = sc.nextInt();

                switch (operator) {
                    case "+":
                        result = num  + num2;
                        break;
                    case "-":
                        result = num  - num2;
                        break;
                    case "*":
                        result = num  * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = (double) num  / num2;
                        }
                        result = (double) num  / num2;
                        break;
                    case "%":
                        result = num  % num2;
                        break;
                    case "^":
                        result = (int) Math.pow(num , num2);
                        break;
                    default:
                        System.out.println("Invalid operator");
                }
            }
        else {
            switch (operator) {
                    case "sqrt":
                        result = Math.sqrt(num);
                        break;
                    case "!":
                        int fact = 1;
                        for (int i = 1; i <= num; i++) {
                            result = fact *= i;
                        }
                        break;
                    case "abs":
                        result = Math.abs(num);
                        break;
                    case "log":
                        result = Math.log(num);
                        break;
                    case "log10":
                        result = Math.log10(num);
                        break;
                    case "exp":
                        result = Math.exp(num);
                        break;
                    default:
                        System.out.println("Invalid operator");}
            }
        }System.out.println(result);
        }
    }
