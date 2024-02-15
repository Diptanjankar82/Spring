package Exception_Handling;

import java.util.Scanner;

public class Exception extends Throwable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int arr[] = new int[5];

        try {
            int ans = 10/number;
            System.out.println(ans +"is answer");
        }catch (ArithmeticException e){
            System.out.println("i have caught the ArithmeticException"+ e.getMessage());
        }



        try{
            for(int i =0;i<=5;i++){
                System.out.print(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("i caught the error"+e.getMessage());
        }
        finally {
            System.out.println("finally block code is always printed");
        }


        System.out.println("ans is Diptanjan");
    }
}
