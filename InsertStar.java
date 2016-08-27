package guvi;

import java.io.IOException;
import java.util.Scanner;

public class InsertStar {

    @SuppressWarnings("resource")
	public static void main(String[] args)throws IOException {
        String line;
        
        int i;
        Scanner in=new Scanner(System.in);
        line=in.nextLine();
        for(i=0;i<line.length()-1;i++){
            System.out.print(line.charAt(i));
        if(line.charAt(i)==line.charAt(i+1))
            System.out.print("*");
        }
       System.out.print(line.charAt(line.length()-1));
}
}
