                //SECOND LARGEST NUMBER IN AN ARRAY

import java.util.Scanner;
import java.lang.String;
class Seclargest
{
   public static void main(String args[])
 {
   int a[]=new int[30];
  int i,j,n,temp;
  Scanner in =new Scanner(System.in);
   System.out.println("enter the value");
  n=in.nextInt();
  for(i=0;i<n;i++)
  {
    a[i]=in.nextInt();
 }
  for(i=0;i<n;i++)
 {
   for(j=i+1;j<n;j++)
  {
    if(a[i] >a[j])
  {
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;
  }
}

}
System.out.println("the second largest element :"+a[n-2]);
}

}