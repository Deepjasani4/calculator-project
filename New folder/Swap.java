class Swap {
    public static void main(String args[]){
       int a = 10;
       int b = 20;

       a = a + b;
       b = a - b;
       a = a- b;

       // biji rite 

    //    int temp = a; // 10
    //    a = b; // 20
    //    b = temp; // 10

       System.out.println("A - " +a);
       System.out.println("B - " +b);
    }
}
