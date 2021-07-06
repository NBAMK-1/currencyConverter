package projects3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("1  Rupees(₹) to Euro(€)");
        System.out.println("2  Rupees(₹) to USD($)");
        System.out.println("3  Rupees(₹) to Pound(£)");
        System.out.println("Choose one from the options: ");

        int exchange = scn.nextInt();
            switch(exchange){
                case 1:{
                    System.out.println("Enter the amount in rupees(₹):");
                    double rs_to_e = scn.nextDouble();
                    if(rs_to_e >= 0){
                        System.out.println(rs_to_e +"rupees is "+"€"+rs_to_e*0.01148400788+"Euro");
                    }else {
                        System.out.println("Please put in positive numbers!");
                    }
                    break;
                }
                case 2:{
                    System.out.println("Enter the amount in rupees(₹):");
                    double rs_to_u = scn.nextDouble();
                    if(rs_to_u >= 0){
                        System.out.println(rs_to_u +"rupees is "+"$"+rs_to_u*0.015152+"USD");
                    }else {
                        System.out.println("Please put in positive numbers!");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Enter the amount in rupees(₹):");
                    double rs_to_p = scn.nextDouble();
                    if(rs_to_p >= 0){
                        System.out.println(rs_to_p +"rupees is "+"£"+rs_to_p*1.28+"Pound");
                    }else {
                        System.out.println("Please put in positive numbers!");
                    }
                    break;
                }
              //  scn.close();

            }
    }
}
