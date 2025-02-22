package partB.ex02;
import java.util.Scanner;
public class SwitchLight {
    public static String switchLight(){
        String response = "";
        Scanner in = new Scanner(System.in);
        /* Put your code in between these comments : Top */
        System.out.println("Enter a color code: ");
        int color = in.nextInt();
        switch (color) {
            case 1:
                System.out.println("Green");
                break;
            case 2:
                System.out.println("Yellow");
                break;
            case 3:
                System.out.println("Red");
                break;
            default:
                System.out.println("invalid code");
        }


        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        String switchOutput = switchLight();
        System.out.println(switchOutput);
    }
}
