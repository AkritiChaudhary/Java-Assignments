import java.util.Scanner;
import java.util.regex.*;
import java.io.*;

public class Regex {
    public static void main(String[] args) {
        
        
        File file = new File("/home/akritd/");
        String ip;
        Scanner sc =new Scanner(System.in);
        do{

            int a=0;
            System.out.println("Enter your condition: ");
            ip=sc.nextLine();
            String[] files = file.list();

            for (String string : files){
                Boolean value = ip.equals(string);
                if (value){
                    System.out.println("File Found : ");
                    System.out.println(string);
                    System.out.println("Path : "+ file.getAbsolutePath());
                } 
                
                if(a == 0){
					System.out.println("File not find.");
				}
            }

        }while(true);

       
    }
    
}
