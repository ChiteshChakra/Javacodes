import java.util.*;

public class Practise {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);
        
        String name = sc.nextLine();
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float price =sc.nextFloat();
        System.out.println(price);
        inputTest();
    }

    public static void inputTest (){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int product = a * b;
        System.out.println(sum);
        System.out.println(product);
    } 
    

    
}
