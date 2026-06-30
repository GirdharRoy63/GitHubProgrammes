import java.io.*;
class LargestPrimeFactor
{
    public static void main (String as[])throws Exception 
    {
        DataInputStream ob=new            DataInputStream(System.in);
        int n,j,hold=0,flag=1; 
        System.out.println("Enter a number :"); 
        n=Integer.parseInt(ob.readLine()); 
        System.out.println("Largest Prime Factor of input number is : ");
      for(int i=2;i<n;i++)
          {
            if(n%i==0)
             {
              for(j=2;j<i;j++)
              {
                  if(i%j==0)
                      break;
              }
              if(j==i)
                  hold=i;
             }
          }
          System.out.println(hold);
    }
}
