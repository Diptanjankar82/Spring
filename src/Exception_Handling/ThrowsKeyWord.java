package Exception_Handling;

import java.util.Scanner;

//The throws keyword is used to declare which exceptions can be thrown from a method
public class ThrowsKeyWord {
    public static void main(String[] args) {
         try {
             meth1();
             meth2();
             meth3();
         } catch (Exception e){
             System.out.println("Handling the exception in common manner for all method");
         }

         }
    public static void meth1 () throws Exception{
        Scanner sc = new Scanner(System.in);
    }

    public static void meth2() throws Exception{
        Scanner sc = new Scanner(System.in);
    }

    public static void meth3() throws Exception{

    }
}
