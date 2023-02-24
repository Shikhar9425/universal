import java.util.*;
public class  ai{
   public static void main (String [] args){
   Scanner sc= new Scanner(System.in);
      int size =sc.nextInt();
      int array[]= new int[size];
     
       for ( int i=0; i<size; i++){

        array[i] = sc.nextInt();
   }

//outputloop         
 for(int i=0; i<size; i++){
     System.out.println(array[i]);}
}
}