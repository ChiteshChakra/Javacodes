class Operators {

    public static void arthematicOperators(){
        int a = 10,b = 20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a%b);
        
    }
    public static void assignmentOperators(){
        int a = 10;
        System.out.println("a = "+a);
        a += 10; // a = a + 10;
        System.out.println("a = "+a);
        a -= 10; // a = a- 10;
        System.out.println("a = "+a);
        a%=10;
        System.out.println("a = "+a);
    }
    public static void  relationalOperators(){
        int  a = 10 ,b = 33;
        System.out.println(a==b);
        System.out.println(a!=b); 
        System.out.println(a>b); 
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);

    }
    public static boolean isEven(int a){
        return ((a%2)==0);
    }
    public static void logicalOperators(){
        int a = 10 , b= 5, c=5;
        if((a<b || a<c)){
            System.out.println("a is smaller");
        }
        else {
            System.out.println("a is greater");
        }
        if(!isEven(8)){
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
    public static void main(String[] args) {
        //arthematicOperators();
        //assignmentOperators();
        relationalOperators();
        logicalOperators();
    }    
}