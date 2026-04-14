// 1) // public class patternpracties {
// public static void main(String args[]) {
// for (int i = 1; i <= 5; i++) {
// for (int j = 1; j <= 5; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// }

// OutPut
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *
  
// 2) // class patternpracties {
//     public static void main(String args[]) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 9; j++) {
//                 if ((i == 1 || i == 5) && (j == 5)) {
//                     System.out.print("* ");
//                 }
//                 else if ((i == 2 || i == 4) && (j == 3 || j == 7)) {
//                     System.out.print("* ");
//                 }
//                 else if ((i == 3) && (j == 1 || j == 5 || j == 9)) {
//                     System.out.print("* ");
//                 }
//                 else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// OutPut
//         *  
//     *       *  
// *       *       *  
//     *       *  
//         *  

// class patternpracties {
//     public static void main(String args[]){
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// OutPut
// *
// * *
// * * *
// * * * *

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=4; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();        }
//     }
// }

// OutPut
// * * * * 
// * * * 
// * * 
// * 

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=1; i<=4; i++){
//             for(int s=3; s>=i; s--){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// OutPut
//       * 
//     * *
//   * * *
// * * * *

// class patternpracties{
//     public static void main(String argd[]){
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=5; j++){
//                 if(i == 1 || j == 1 || i == 5 || j == 5){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// OutPut
// * * * * * 
// *       *
// *       *
// *       *
// * * * * *

// class patternpracties{
//     public static void main(String args[]){
//         int num = 1;
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

// OutPut
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15


// class patternpracties{
//     public static void main(String args[]){
//         int num = 1;
//         for(int i=1; i<=6; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(num +" ");
//             }
//             System.out.println();
//             num += 1;
//         }
//     }
// }

// OutPut
// 1 
// 2 2 
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
// 6 6 6 6 6 6

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=1; i<=4; i++){
//             for(int s=4; s>=i; s--){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// OutPut
//     * 
//    * *
//   * * *
//  * * * *

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=i ;j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// OutPut
// 1 
// 1 2
// 1 2 3
// 1 2 3 4

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=4; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// OutPut
// 1 2 3 4 
// 1 2 3
// 1 2
// 1

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=i; j++){
//                 if((i + j) % 2 == 0){
//                     System.out.print("1 ");
//                 }else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();   
//         }
//     }
// }

// OutPut
// 1 
// 0 1
// 1 0 1
// 0 1 0 1

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int s=1; s>=i-5; s--) {
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=4; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();              
//         }
//     }
// }

// OutPut
//       * * * * 
//      * * * *
//     * * * *
//    * * * *
//   * * * *

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// OutPut
// * 
// * *
// * * *
// * * * *
// * * * * *

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=5; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// OutPut
// * * * * * 
// * * * *
// * * *
// * *
// *

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int s=1; s>=i-5; s--){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// OutPut
//         * 
//       * *
//     * * *
//   * * * *
// * * * * *

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=5; i>=1; i--){
//             for(int s=1; s>=i-5; s--){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// OutPut

    // * * * * * 
    //   * * * *
    //     * * *
    //       * *
    //         *

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=6-i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i=4; i>=1; i--){
//             for(int j=1; j<=6-i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// OutPut

// * * * * * 
// * * * *
// * * *
// * *
// *
// * *
// * * *
// * * * *
// * * * * *

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int s=4; s>=i; s--){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 if( i==5 || j==1 || j==i){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }            }
//             System.out.println();
//         }
//     }
// }

// OutPut
//     * 
//    * *
//   *   *
//  *     *
// * * * * *

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=5; i>=1; i--){
//             for(int s=4; s>=i; s--){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 if( i==5 || j==1 || j==i){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }            }
//             System.out.println();
//         }
//     }
// }

// OutPut
// * * * * * 
//  *     *
//   *   *
//    * *
//     *

// class patternpracties{
//     public static void main(String args[]){
//      for(int i=1; i<=4; i++){
//             for(int s=4; s>=i; s--){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 if( j==1 || j==i){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }            }
//             System.out.println();
//         }   
//         for(int i=4 -1; i>=1; i--){
//             for(int s=4; s>=i; s--){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 if( j==1 || j==i){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }            }
//             System.out.println();
//         }
//     }
// }

// output
//     * 
//    * *
//   *   *
//  *     *
//   *   *
//    * *
//     *

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=5; i>=1; i--){
//             for(int s=5; s>=i; s--){
//                 System.out.print(" ");
//             }   
//             for(int j=1; j<=i; j++){
//                 if(i == 5 || j == 1 || j == i){
//                     System.out.print("* ");
//             }else{
//                 System.out.print("  ");
//             }
//         }
//         System.out.println();
//      }
//        for(int i=2; i<=5; i++){
//             for(int s=5; s>=i; s--){
//                 System.out.print(" ");
//             }   
//             for(int j=1; j<=i; j++){
//                 if(i == 5 || j == 1 || j == i){
//                     System.out.print("* ");
//             }else{
//                 System.out.print("  ");
//             }
//         }
//         System.out.println();
//      }
//   }  
// }

// OutPut
//  * * * * * 
//   *     *
//    *   *
//     * *
//      *
//     * *
//    *   *
//   *     *
//  * * * * *

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i=3; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// OutPut
// * 
// * *
// * * *
// * * * *
// * * *
// * *
// *

// class patternpracties{
//     public static void main(String args[]){
//         for(int i=1; i<=4; i++){
//             for(int s=3; s>=i; s--){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*   ");
//             }
//             System.out.println();
//         }
//         for(int i=3; i>=1; i--){
//             for(int s=3; s>=i; s--){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*   ");
//             }
//             System.out.println();
//         }
//     }
// }

// OutPut
//       *   
//     *   *
//   *   *   *
// *   *   *   *
//   *   *   *
//     *   *
//       *


// class patternpracties{
//     public static void main(String args[]){
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }for(int s=1; s<=2*(4-i); s++){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i=4; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }for(int s=1; s<=2*(4-i); s++){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//Output
// *             * 
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *
