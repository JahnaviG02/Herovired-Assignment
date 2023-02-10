import java.io.*; 
import java.util.Scanner;
class Unique{ 
static void Distinct(int arr[], int n)
{
  for(int i=0;i<n;i++)
  {
     int j;
     for(j=0;j<i;j++)
     if(arr[i]==arr[j])
         break;
     if(i == j)
       System.out.print(arr[i]+" ");
   }
}
public static void main (String[] args)
 {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter numbers: ");
      for(int i=0; i<n; i++) {
        arr[i]=sc.nextInt();
      }
      Distinct(arr, n); 
    }
}