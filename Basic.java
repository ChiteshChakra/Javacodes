import java.util.*;

public class Basic{
    public static void main(String args[]){
        int age = 16;
        if(age >= 18){
            System.out.println("adult : drive,vote");
        }
        if(age > 13 && age < 18){
            System.out.println("tennager");

        }
        else{
            System.out.println("not adult");
        }
        larger();
        
    }
    public static void larger() {
        int A = 1;
        int B = 5;

        if(A >= B ){
           System.out.println("A is largest of 2");
        }
        else{
            System.out.println("B is largest of 2");
        }
        oddoreven();
    }
    public static void oddoreven(){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");            
        }
        statements();
    }
    public static void statements(){
        int age = 6;
        if(age >= 18){
            System.out.println("Adult");
        }
        else if (age >= 13 && age < 18){
            System.out.println("teenager");
        }
        else{
            System.out.println("child");
        }

    }


    
}
