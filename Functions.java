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
    //10

    public static void primerange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();

    }
    //11
    public static void binaryToDecimal(int biNum){
        int myNum = biNum;
        int pow = 0;
        int decNum = 0;
        while(biNum > 0){
            int lastDigit = biNum %10;
            decNum = decNum + (lastDigit *(int) Math.pow(1 , 2));
             pow++;
             biNum = biNum/10;
        }
        System.out.println("decimal " + myNum + " = " + decNum);
    }
    //12
    public static void decimalToBinary(int n){
        int myNum = n;
        int pow = 0 ;
        int biNum = 0;
        while(n > 0){
            int reminder = n % 2;
            biNum = biNum + (reminder * (int )Math.pow(10,pow));

            pow ++;
            n= n/2;

        }
        System.out.println(" binary for of " + myNum + " = " + biNum);

        

    }

    //main function
    public static void main(String args[]){
        //Swapping of two numbers
        //int a =5;
        //int b=10;
        //swap();

        //Calculating sum
        // calsum();

        //Hello program
        //hello();

        //Product of a and b
        // int prod = multi(a,b);
        // System.out.println(" a * b = "+prod);
        // prod = multi(12,4);
        // System.out.println("a * b ="+prod);
        
        //Factorial
        //System.out.println(factorial(10));
        
        //Binomial coefficient
        //System.out.println(bio(5 ,2));

        //Function overloading using parameters
        // System.out.println(summ(3,5));
        // System.out.println(summ(4,5,6));

        //Functiion overloading using datatypes
        //System.out.println(suum(3,5));
        //System.out.println(suum(4.5f,7.8f));

        //Prime is true or not 
        // System.out.println(isPrime(5));

        //In built 
        //Prime is true or not 
        // System.out.println(isprime(5));

        //Prime in range
        //primerange(20);

        //Binry to decimal
        //binaryToDecimal(103);

        //Decimal to binary
        decimalToBinary(7);

       
    }

}