package learning;

import java.util.Scanner;

public class Example9 {
    public void conditionalOperation(){
        int val = 2, var = 45;
//        Scanner number = new Scanner(System.in);
//        int val = number.nextInt();
//        int var = number.nextInt();

        if(val != 234 && var == 45 ){
            System.out.println("val is not 234");
        }
        else if(val > 100){
            System.out.println("val is bigger than 100!");
        }
        else if(val < 100){
            System.out.println("val is less than 100!");
        }
        else {
            System.out.println("val is unknown...");
        }
    }
}
