import java.util.*;

public class Loop{
    public static void jjk(){
        int counter = 0;
        while(counter < 15){
            System.out.println("hello");
            counter++; 
        }
        System.out.println("printer hello 15x");

        
    }
    public static void number (){
        int counter =1;
        while(counter <= 10){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();

       
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
    public static void krt() {
        for(int  i=1;i<=10;i++){
            System.out.print("Guru ");

        }
        System.out.println();

        
    }
    public static void pattern(){
        int lines = 1;
        for (lines =1;lines<=4;lines++){
            System.out.println("****");
        }

       
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
    
    public static void reversenumber2(){
        Scanner sc = new  Scanner (System.in);
        System.out.println("enter the number :");
        int n = sc. nextInt();
        int rev=0;
        int lastdigit;
        while ( n>0){
            lastdigit = n%10;
            rev =(rev*10) +lastdigit;// storing the last digit 
            n=n/10;
        }
        System.out.println(rev);

        
    }
    public static void hox() {
        
        int counter =1;
        do{
            System.out.println("student");
            counter ++;
        }
        while(counter <=15);
        
    }
    public static void stsm(){

    for(int i=1;i<=5;i++){
        if(i==3){
            break;
        }
        System.out.println(i);
    }
    System.out.println("out of the loop");

    
    }
    

    public static void user(){
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("enter your number");
            int n = sc.nextInt();
            if(n%10 == 0){
                break;
            }
            System.out.println(n);
            
        }while(true);
        

    }
    public static void  con(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number n:");
        int n = sc.nextInt();
        for(int i =n;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
        
    }
    public static void newcon(){
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter your numbe x:");
            int n=sc.nextInt();
            if(n % 10==0){
              break;
            }
            System.out.println("number was : " + n);

        }while(true);
    }
    public static void ime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n =sc.nextInt();
        for(int i=2;i<=n-1;i++){
            if(n%i == 0){
                System.out.println("not prime");
            }
            else{
                System.out.println("prime");
            }
            break;

        }



    }
    public static void main(String[] args) {
        // jjk();
        // newcon();
        // con();
        // hox();
        // reversenumber2();
        // reversenumber();
        // stsm();
        // user();
        // pattern();
        // krt();
        // usernumber();
        // number();
        // natural();
        ime();
    }
}
