package partB.ex01;
import java.util.Scanner;
public class IfLight {
    public static String ifLight(){
        String response = "";
        Scanner in = new Scanner(System.in);
        /* Put your code in between these comments : Top */
        System.out.println("Enter a code: ");
        int light = in.nextInt();

        if (light == 1) {
            System.out.println("Next traffic light is green");
        }
        if (light == 2) {
            System.out.println("Next traffic light is yellow");
        }
        if (light == 3) {
            System.out.println("Next traffic light is red");
        } else  {
            System.out.println("invalid");
        }





        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        String switchOutput = ifLight();
        System.out.println(switchOutput);
    }
}
