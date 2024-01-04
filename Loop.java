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
    }
}