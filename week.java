package day.two;

import java.util.Scanner;

public class day {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a day : ");
        String day=scan.next();
        switch(day.toLowerCase()){
            case "sunday":System.out.println("WorkingDay("+day+") : "+false);break;
            default:System.out.println("WorkingDay("+day+") : "+true);
        }
        scan.close();
    }
}
