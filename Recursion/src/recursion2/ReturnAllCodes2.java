package recursion2;

import java.util.Scanner;

public class ReturnAllCodes2 {

    // public static  String[] getCode(String input){
    //     return null;
    // }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        String output[] = getCode(input);
        for(int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

}
