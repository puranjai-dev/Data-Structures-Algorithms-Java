import java.util.Scanner;

public class BasicCalc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true){

            System.out.print("Enter operator: ");
            char op = in.next().trim().charAt(0);
            System.out.println();
            System.out.println("Enter two numbers: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            if(op == '+'){
                System.out.println(num1+num2);
            }
            else if(op == '-'){
                System.out.println(num1-num2);
            }
            else if(op == '*'){
                System.out.println(num1*num2);
            }
            else if(op == '/'){
                System.out.println(num1/num2);
            }
            else if(op=='x' || op=='X')
                break;

            else{
                System.out.println("Invalid Operation");
            }
        }
    }
}
