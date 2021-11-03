package org.vashonsd;

import java.util.Scanner;

public class Main{
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" give me a hour and minutes in decimal form ");
        double h = scan.nextDouble();
        double m = (h * 60.0) - ((int)h * 60);
        System.out.println(h + " hours = "  + (int)h + " hours and " + ((int)m)+  " minutes " );
    }
}
