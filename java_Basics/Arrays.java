import java.util.Scanner;

public class Arrays {
    public static void main(String args[]){
        // int[] marks = new int[3];
        Scanner sc =new Scanner(System.in);
        int siza = sc.nextInt();
        int marks[]= new int[siza];
        // int marks[]={97,98,95};
        // marks[0] = 97; //py
        // marks[1] = 98; //chem
        // marks[2] = 95; //eng

        for(int i=0;i<siza;i++){
            marks[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        // for(int i=0;i<siza;i++){
        //     System.out.println(marks[i]);
            //    if(marks[i] ==x){
            //     System.out.println("x found at index :" ,+i);
            //    }
        // }
        System.out.println(marks.length);
    }
}
