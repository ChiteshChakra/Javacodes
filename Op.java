import java.util.*;
public class Op{
    public static void main(String[]args){
        double temp=103.5;
        if(temp>100){
            System.out.println("You Have Fever");
        }
        else{
            System.out.println("you dont have fever");
        }
        utr();
    }
     public static void utr(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        long a = sc.nextLong();
        if(a>0){
            System.out.println("positive");
        }
        else{
            System.out.println("Negative");
        }
        date();
    }
    public static void date(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the week number(1-7):");
        int x =sc.nextInt();
        
        switch (x) {
            case 1 : System.out.println("monday" );
                break;
            case 2 : System.out.println("Tuesday");
                break;
            case 3 : System.out.println("Wednesday");
                break;
            case 4 : System.out.println("Thursday");
                break;
            case 5 : System.out.println("Friday");
                break;
            case 6 : System.out.println("Saturday");
                break;
            case 7 : System.out.println("Sunday");
                break; 
            default : System.out.println("Invalid input ! please enter the week number between 1-7.");
        } 
        value();

    } 
    public static void value(){
        int a =62 , b=36;
        boolean x = (a<b) ? true : false;
        int y = (a>b) ? a : b ;
        System.out.println(x);
        System.out.println(y);

        ded();
    }

    public static void ded(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year :");
        int year = sc.nextInt();
        if(year % 4 == 0){
              else if(year % 100 == 0){
                else if(year % 400 == 0){
                    System.out.println("leap year");
                }
            }else{System.out.println("nnot a leap year");
        }

        }
    }
    

     
}
