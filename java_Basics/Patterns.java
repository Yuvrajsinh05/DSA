import java.util.*;
public class Patterns {
    public static void main(String args[]) {
        int n = 5;
        int m = 5;

     //outerloop
        //  for(int i=1; i<=n ; i++){
        //     //innerLoop
        //     for(int j=1; j<=m;j++){
        //       System.out.print("*");
        //     }
        //     System.out.println();
        //  }
        
     //outerloop
        //  for(int i=1; i<=n ; i++){
        //     //innerLoop
        //     for(int j=1; j<=m;j++){
        //       if(i == 1 || j == 1 || i==n || j==m){
        //         System.out.print("*");
        //       }else{
        //         System.out.print(" ");
        //       }
        //     }
        //     System.out.println();
        //  }

     //outerloop
        //  for(int i=1; i<=n ; i++){
        //     //innerLoop
        //     for(int j=1; j<=i;j++){
        //         System.out.print("*");
             
        //     }
        //     System.out.println();
        //  }


        //  for(int i=n; i>=1 ; i--){
        //     //innerLoop
        //     for(int j=1; j<=i;j++){
        //         System.out.print("*");
             
        //     }
        //     System.out.println();
        //  }

    //outer loop
        // for(int i=1;i<=n;i++){
        //     //inner loop -> space print
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }

        //     // inner loop -> start print
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    //outer loop
    // int n = 5;
    // for(int i =1;i<=n;i++){
    //     for(int j=1 ; j<=i;j++){
    //         System.out.print(j +" ");
    //     }
    //     System.out.println();
    // }

    // for(int i =1;i<=n;i++){
    //     for(int j=1 ; j<=n-i+1;j++){
    //         System.out.print(j +" ");
    //     }
    //     System.out.println();
    // }

    // int num = 1 ;
    // for(int i =1;i<=n;i++){
    //     for(int j=1 ; j<=i;j++){
    //         System.out.print(num + " ");
    //         num++;
    //     }
    //     System.out.println();
    // }
    
    // for(int i = 1; i<=n;i++){
    //     for(int j=1; j<=i;j++){
    //         int sum = i+j;
    //         if(sum%2 ==0){
    //             System.out.print("1 ");
    //         }else{
    //             System.out.print("0  ");
    //         }
    //     }
    //     System.out.println();
    // }


//  butterfly 

    // upper half
    // for(int i=1;i<=n;i++){
    //     // 1st part
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     //spaces
    //     int spaces = 2 * (n-i);
    //     for(int j=1 ; j<=spaces ; j++){
    //         System.out.print(" ");
    //     }
    //     //2nd part
    //     for(int j=1 ; j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println("");
    // }
    // for(int i=n;i>=1;i--){
    //     // 1st part
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     //spaces
    //     int spaces = 2 * (n-i);
    //     for(int j=1 ; j<=spaces ; j++){
    //         System.out.print(" ");
    //     }
    //     //2nd part
    //     for(int j=1 ; j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println("");
    // }

    for(int i=1; i<=n ; i++){
        //spaces
        for(int j=1; j<=n-i ;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=5;j++){
            System.out.print(("*"));
        }
        System.out.println();
    }

    }
}
 