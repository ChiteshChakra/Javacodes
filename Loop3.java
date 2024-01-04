import java.util.*;
public class Loop3 {
    public static void main(String[] args) {
        
        int counter =1;
        do{
            System.out.println("student");
            counter ++;
        }
        while(counter <=15);
        stsm();
    }
    public static void stsm(){

    for(int i=1;i<=5;i++){
        if(i==3){
            break;
        }
        System.out.println(i);
    }
    System.out.println("out the loop");


    }
    
}
