import java.util.*;
public class Pattern {
    public static void star(){
        for (int line =1;line<=4;line++){
            for(int j=1;j<=line;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void  revpatt(){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pyra(){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int number=1;number<=i;number++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void cho(){
        int n=4;
        char ch = 'A';
        for(int i=1;i<=n;i++){
        for(int chars=1;chars<=i;chars++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        star();
        revpatt();
        pyra();
        cho();
    }
}