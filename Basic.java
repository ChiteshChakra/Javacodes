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
    }

    
}
