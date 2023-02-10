import java.util.*;
class Missing{	
public static void MissingElements(int arr[],int N)								
{
  int[] b = new int[arr[N-1]+1];
  for(int i=0;i<N;i++)
   {
     b[arr[i]]=1;
   }
  for(int i=arr[0];i<=arr[N-1];i++)
   {
     if(b[i] == 0)
      {
        System.out.print(i+" ");
      }
   }
}
public static void main (String[] args)
 {
	
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int arr[] = new int[n];
   System.out.println("Enter numbers: ");
   for(int i=0; i<n; i++) {
       arr[i] = sc.nextInt();
    }
    MissingElements(arr, n);
 }
}

