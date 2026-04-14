
//     public static void main(String args[]){
//         for(int i = 1; i <= 4; i++){
//              for(int s = 4; s > i; s--){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <=i; j++){
//                  System.out.print("* ");
//             }  

//                  System.out.println();   // new line ma print thay 
//         }
//     }
// }

// class pattens{
//     public static void main(String args[]){
//         for(int i = 1; i <= 5 ; i++){
//             for(int s = 5; s > i; s--){  // space apava mate
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println(); // new line ma print thay
//         }
//     }
// }
//     * 
//    * *
//   * * *
//  * * * *
// * * * * *

// class pattens{
//     public static void main(String args[]){
//         for(int i = 1; i <= 5 ; i++){
//             for(int s = 5; s > i; s--){  // space apava mate
//                 System.out.print("");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();  // new line ma print thay
//         }
//     }
// }

// * 
// * *
// * * *
// * * * *
// * * * * *

// class pattens{
//     public static void main(String args[]){
//         for(int i = 1; i <= 5 ; i++){
//             for(int s = 5; s > i; s--){  // space apava mate
//                 System.out.print("  ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();  // new line ma print thay
//         }
//     }
// }

//         * 
//       * *
//     * * *
//   * * * *
// * * * * *

// class pattens{
//     public static void main(String args[]){
//         int num = 1;
//         for(int i = 1; i <= 5 ; i++){
//             for(int j = 1; j < i ; j++){
//                 System.out.print(num);
//                 num ++;
//             }
//             System.out.println(); // new line ma print thay
//         }
//     }
// }
// 1
// 23
// 456
// 78910

// class pattens{
//     public static void main(String args[]){
//         for(int i = 1; i <= 6; i++){
//             for(int s = 6; s > i; s--){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j < i; j++){
//                 System.out.print(j);
//             }
//              System.out.println(); // new line ma print thay 
//         }
//     }
// }

//     1
//    12
//   123
//  1234
// 12345

// number increase in pyramid

// class pattens{
//    public static void main(String[] args) {

//       for(int i=1; i<=5; i++){
//         for(int j=1; j<i; j++){
//           System.out.print(" " + j);
//         }
//         System.out.println();
//       }
//     }
// }

// number increase in pyramid reverse

// class pattens{
//    public static void main(String[] args) {

//       for(int i=1; i<=6; i++){
//         for(int j=1; j<6-i; j++){
//           System.out.print(" " + j);
//         }
//         System.out.println();
//       }
//     }
// }

// number change in pyramid

// class pattens{
//    public static void main(String[] args) {

//     int num=1;
//     for(int i=1; i<=4; i++){
//       for(int j=1; j<=i; j++){
//         System.out.print(" "+num);
//         num ++;
//       }
//       System.out.println();
//     }
//     }
// }

// zero - one triangle

// class pattens{
//    public static void main(String[] args) {
//     for(int i=1; i<=4; i++){
//       for(int j=1; j<=i; j++){
//         if((i+j)%2==0){
//           System.out.print(1 + " ");
//         }else{
//           System.out.print(0 + " ");
//         }
//       }
//       System.out.println();
//     }
//    }
//   }

// Rhombus pattern 

// class pattens{
//    public static void main(String[] args) {
//     for(int i=1; i<=5; i++){
//       for(int s=1; s>=i-5; s--){
//         System.out.print(" ");
//       }
//       for(int j=1; j<=4; j++){
//        System.out.print("* ");
//       }
//       System.out.println();
//     }
//    }
//   }

// squre fill pattern

// class pattens{
//    public static void main(String[] args) {
//     for(int i=1; i<=6; i++){
//        for(int j=1; j<=6; j++){
//          System.out.print("* ");
//        }
//        System.out.println();
//      }
//    }
//   }

// right half pyramid

// class pattens{
//    public static void main(String[] args) {
//    for(int i=1; i<=5; i++){
//     for(int j=1; j<=i; j++){
//       System.out.print("* ");
//     }
//     System.out.println();
//    }
//    }
//   }

// reverce right pyramid

// class pattens{
//    public static void main(String[] args) {
//    for(int i=1; i<=5; i++){
//     for(int j=1; j>=i-4; j--){
//       System.out.print("* ");
//     }
//     System.out.println();
//    }
//    }
//   }

// left half pyramid

// class pattens{
//   public static void main(String argd[]){
//     for(int i = 1; i <= 5; i++){
//       for(int s = 1; s <= 5 - i; s++){
//         System.out.print("  ");
//       }
//       for(int j = 1; j <= i; j++){
//         System.out.print("* ");
//       }
//       System.out.println();
//     }
//   }
// }

//  left half pyramid

// class pattens{
//   public static void main(String argd[]){
//     for(int i = 1; i <= 5; i++){
//       for(int s = 1; s <= 5 - i; s++){
//         System.out.print("  ");
//       }
//       for(int j = 1; j <= i; j++){
//         System.out.print("* ");
//       }
//       System.out.println();
//     }
//   }
// }

//  K pattern

// class pattens{
//   public static void main(String argd[]){
//  for(int i = 10; i > 1; i--){
//           for(int j = 0; j < i; j++){
//             System.out.print("* ");
//           }
//           System.out.println();
//         }

//         for(int i=0; i<=9; i++){

//         for(int j=0; j<=i; j++){
//         System.out.print("* ");
//       }
//        System.out.println();
//     }
//   } 
// }    

// reverce left half pyramid

// class pattens{
//   public static void main(String argd[]){
//    for(int i=5; i>0; i--){
//     for(int s=0; s<5-i; s++){
//       System.out.print("  ");
//     }
//     for(int j=0; j<i; j++){
//       System.out.print("* ");
//     }
//     System.out.println();
//    }
//  } 
// }

// hollow triangle

// class pattens{
//   public static void main(String argd[]){
//    for(int i=5; i>=1; i--){
//     for(int s=5; s>=i; s--){
//       System.out.print(" ");
//     }
//     for(int j=1; j<=i; j++){
//       if(i == 5 || j ==1 || j == i){
//         System.out.print("* ");
//       }else {
//     System.out.print("  ");
//     }
//    } 
//      System.out.println();
//    }
//  } 
// }

// Diamond pattern

//  class patterns{
//   public static void main(String args[]){
//         // upper part of diamond
//     for(int i=1; i<=4; i++){
//         for(int s=4; s>i; s--){
//           System.out.print(" ");
//         }
//         for(int j=1; j<=i; j++){
//           if(j == 1 || j == i){
//             System.out.print("* ");
//           }else{
//             System.out.print("  ");
//           }
//         }
//         System.out.println();
//       }
//       // lower part of diamond
//       for(int i=4 - 1; i>=1; i--){
//         for(int s=4; s>i; s--){
//           System.out.print(" ");
//         }
//         for(int j=1; j<=i; j++){
//           if(j == 1 || j == i){
//             System.out.print("* ");
//           }else{
//             System.out.print("  ");
//           }
//         }
//         System.out.println();
//       }
//   }
//  }

// Hollow house pattern

//  class patterns{
//   public static void main(String args[]){
//      for(int i=4; i>=1; i--){
//         for(int s=4; s>=i; s--){
//           System.out.print("  ");
//         }
//         for(int j=1; j<=i; j++){
//           if(i == 4 || j == 1 || j == i){
//             System.out.print("*   ");
//           }else{
//             System.out.print("    ");
//           }
//         }
//         System.out.println();
//       }

//       for(int i=2; i<=4; i++){
//         for(int s=4; s>=i; s--){
//           System.out.print("  ");
//         }
//         for(int j=1; j<=i; j++){
//           if(i == 4 || j == 1 || j == i){
//             System.out.print("*   ");
//           }else{
//             System.out.print("    ");
//           }
//         }
//         System.out.println();
//       }
//   }
//  }

// right pascal triangle

// class patterns{
//   public static void main(String args[]){
//     for(int i=1; i<=4; i++){
//       for(int j=1; j<=i; j++){
//         System.out.print("* ");
//       }
//       System.out.println();
//     }

//     for(int i=4-1; i>=1; i--){
//       for(int j=1; j<=i; j++){
//         System.out.print("# ");
//       }
//       System.out.println();
//     }
//   }
// }

// butterfly pattern

// class patterns{
//   public static void main(String args[]){
//     for(int i=1; i<=4; i++){
//       for(int j=1; j<=i; j++){
//         System.out.print("*  ");
//       }
//       for(int s=1; s<=2*(4-i); s++){
//         System.out.print("   ");
//       }
//        for(int j=1; j<=i; j++){
//         System.out.print("*  ");
//       }
//       System.out.println();
//     }

//       for(int i=4; i>=1; i--){
//       for(int j=1; j<=i; j++){
//         System.out.print("*  ");
//       }
//       for(int s=1; s<=2*(4-i); s++){
//         System.out.print("   ");
//       }
//        for(int j=1; j<=i; j++){
//         System.out.print("*  ");
//       }
//       System.out.println();
//     }
//   }
// }

//

//         *         
//     *       *     
// *       *       * 
//     *       *     
//         *       

class patterns {
  public static void main(String args[]) {
    int n = 5;

    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= 9; j++) {

        // Row 1 & 5 → center star
        if ((i == 1 || i == 5) && j == 5) {
          System.out.print("* ");
        }

        // Row 2 & 4 → 2 stars
        else if ((i == 2 || i == 4) && (j == 3 || j == 7)) {
          System.out.print("* ");
        }

        // // Row 3 → 3 stars
        else if (i == 3 && (j == 1 || j == 5 || j == 9)) {
          System.out.print("* ");
        }

        else {
          System.out.print("  ");
        }
      }

      System.out.println();
    }
  }
}
