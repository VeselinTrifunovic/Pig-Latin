package javaapplication3;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        System.out.print("enter the text: ");
        Scanner cti = new Scanner(System.in);
        String a = cti.nextLine();
        a.split(" ");
       
        for(int i=0;i<a.length();i++)
            System.out.println(a);

        String result = new StringBuilder(a).delete(0, 1).append(a.substring(0, 1)).toString();

        System.out.println(result + "ay");
    }

}
