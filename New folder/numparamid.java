public class numparamid {
    public static void main(String[] args) {
    int num = 0;
      for(int i=1; i<=7; i++){
        for(int s=7; s>i; s--){
          System.out.print(" ");
        }
        for(int j=1; j<i; j++){
          System.out.print(" "+num);
        }
        System.out.println();
        num += 1;
      }
    }
    
}
