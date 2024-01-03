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

        earning();
    }
    public static void earning(){
        Scanner sc = new Scanner(System.in);
    int income = sc.nextInt();
    int tax;

    if(income < 500000){
        tax = 0;
    }
    else if (income >= 500000 && income < 1000000){
        tax = (int) (income * 0.2);
    }
    else{
        tax = (int) (income *0.3);
    }
    System.out.println("your tax is :" + tax);


    largest ();
    }
   
    
    public static void largest(){
        int a = 1 , b = 3 , c = 6;
         if( (a >= b) && (a > c)){
            System.out.println("largest is a");
         }
         else if(b >= c){
            System.out.println("largest is b");
         }
         else {
            System.out.println("largest is c");
         }

         ternary();
    }

    public static void ternary(){
        int number = 4;
        String type = ((number%2) == 0) ? "even" : "odd";
        System.out.println(type);

        college();
    }


    public static void college(){
        int marks = 70;

        String reportCard = marks >= 33 ? "PASS" : "FAIL";
        System.out.println(reportCard);
    }

    
}
