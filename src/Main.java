import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int result=0;

        int num1= sc.nextInt();
        while(true) {
            char operator = sc.next().charAt(0);
            if (operator == '=') {
                break;
            }

            int num2 = sc.nextInt();
            switch (operator) {
                case '+':
                   num1=num1 + num2;
                    break;
                case '-':
                  num1=num1 - num2;
                    break;
                case '*':
                   num1=num1 * num2;
                    break;
                case '/':
                    if (num2!=0){
                        num1=num1/num2;
                    }
                 num1=num1 / num2;
                    break;
                case '%':
                  num1=num1 % num2 ;
                    break;
                case '^':
                    num1= (int) Math.pow(num1,num2);
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        }
        System.out.println(num1);
        }
    }
