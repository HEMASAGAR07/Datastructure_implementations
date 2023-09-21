
//array creation(user)
package Data_structures;
import java.util.*;
import java.io.*;
import java.util.Arrays;
public class array_1d {
	public static void main(String args[]) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the size of the array");
	 int m = sc.nextInt();
		
     int []array1=new int[m];
     System.out.println("Enter the elements of the array");
     for(int i=0; i<array1.length;i++) {
    	 array1[i]=sc.nextInt();
     }
     for(int i=0; i<array1.length;i++) {
    	System.out.print(array1[i]+" ");
     }
     System.out.println();
     
    }}
    
