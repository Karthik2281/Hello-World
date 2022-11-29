import java.util.*;

import org.jcp.xml.dsig.internal.SignerOutputStream;

public class Calculator {
    public static void main(String args[]) {
        int i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1.ADD");
        System.out.println("2.SUB");
        System.out.println("3.MUL");
        System.out.println("4.DIV");

        System.out.println("ENTER YOUR CHOICE :");
        i = sc.nextInt();
        System.out.println("no.1");
        j = sc.nextInt();
        System.out.println("no.2");
        k = sc.nextInt();

        switch (i) {
            case 1:
                System.out.println("add is:" + (j + k));
                break;
            case 2:
                System.out.println("sub is:" + (j - k));
                break;
            case 3:
                System.out.println("mul is" + (j * k));
                break;
            case 4:
                System.out.println("div is:" + (j / k));
                break;
            default:
                System.out.println("error");
        }

    }
}