import java.util.*;

public class Loop {
    public static void main (String args[]){
        int counter = 0;
        while(counter < 15){
            System.out.println("hello");
            counter++; 
        }
        System.out.println("printer hello 15x");

        number();
    }
    public static void number (){
        int counter =1;
        while(counter <= 10){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();

        usernumber();
    }

    public static void usernumber(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter range n :");
        int   n = sc.nextInt();
        int counter =1;
        while(counter <= n){
            System.out.print(counter + " ");
            counter ++;
        }
        System.out.println();

        natural();
    }

    public static void natural(){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number n :");
        int n = sc.nextInt();
        int sum=0,  i=1;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("sum is :" + sum);
    }
}