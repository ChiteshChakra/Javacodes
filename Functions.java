import java.util.*;
//1
public class Functions{
    public static int hello(){
        System.out.println("hello");
        return 3;
    } 
    //2
    public static void calsum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = sc.nextInt();
        System.out.print("enter b: ");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("sum of a and b is : "+sum);
    }
    //3
    public static void swap(int a, int b){
        //swap exchange 
       

        //swap 
        int temp =a;
        a=b;
        b=temp;
        System.out.println(" a="+ a);
        System.out.println("b="+b);
    }
    //4
    public static int  multi(int a ,int b){
        int product = a * b;
        return product;
    }
    //5
    public static int factorial(int n){
     
        int f=1;
        for(int i=1;i<=n;i++){
            f = f * i;
        }
        return f;
    }
    public static int bio(int n , int r){
        int nfact =factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n-r);

        int bio =nfact/(rfact * nmrfact);
     return bio;   
    }
    //6
    //func to calc sum of 2 num
    public static int  summ(int a, int b){
        return a+b;
    }
    //func to calc sum of 3 nums
    public static int summ(int a,int b,int c){
        return a+b+c;
    }
    //7
    //fun calc int sum
    public static int suum(int a,int b){
        return a+b;
    }
    //func calc float sum
    public static float suum(float a,float b){
        return a+b;
    }
    //8
    public static boolean isPrime(int n){
        boolean isPrime = true ;
        for(int i =2;i<=n-1;i++){
            if(n%i==0){
            isPrime =false;
            break;
        }
     }
     return isPrime;
    }
    //9
    public static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;

            }
        }
        return true;
    }

    //main function
    public static void main(String args[]){
        
        //int a =5;
        //int b=10;
        //swap();

       // calsum();

        //hello();

        //product of a and b
        // int prod = multi(a,b);
        // System.out.println(" a * b = "+prod);
        // prod = multi(12,4);
        // System.out.println("a * b ="+prod);
        
        //factorial
        //System.out.println(factorial(10));
        
        //binomial coefficient
        //System.out.println(bio(5 ,2));

        //function overloading using parameters
        // System.out.println(summ(3,5));
        // System.out.println(summ(4,5,6));

        //functiion overloading using datatypes
        //System.out.println(suum(3,5));
        //System.out.println(suum(4.5f,7.8f));

        //prime is true or not 
        // System.out.println(isPrime(5));

        //in built 
        //prime is true or not 
        // System.out.println(isprime(5));



       
    }

}