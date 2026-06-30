import java.io.*;
class RecursiveFact
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n,p;
        System.out.println("Enter a number : ");
         n=Integer.parseInt(ob.readLine());
         RecursiveFact r=new RecursiveFact();
         p=r.fact(n);
         System.out.println("Factorial of given number is :\n" + p);
    }
  int fact(int p)
  {
      if(p==0)
         return 1;
      else
         return p*fact(p-1);
  }
}
