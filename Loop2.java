import java.util.*;

public class Loop2 {
    
    public static void main(String[] args) {
        for(int  i=1;i<=10;i++){
            System.out.print("Guru ");

        }
        System.out.println();

        pattern();
    }
    public static void pattern(){
        int lines = 1;
        for (lines =1;lines<=4;lines++){
            System.out.println("****");
        }

       reversenumber();
        }
    
    public static void reversenumber(){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter a number:");
        int n =sc.nextInt();
        int lastdigit;
        while(n>0){
            lastdigit=n%10;// mod of any number by 10 gives last digit of the number
            System.out.print(lastdigit);
            n=n/10;// to remove last digit  from the number
        }
            System.out.println();
        }
}