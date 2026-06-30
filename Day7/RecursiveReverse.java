import java.io.*;
class RecursiveReverse
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n,len;
        System.out.println("Enter a number : ");
         n=Integer.parseInt(ob.readLine());
         len=(""+n).length();
         System.out.println("Reversed number is : ");
         RecursiveReverse r=new RecursiveReverse();
        System.out.println(r.reverse(n,len));
          }
        int reverse(int p,int l)
          {
              if(p==0)
                 return 0;
              else
                   return (p%10)*(int)(Math.pow(10,--l))+ reverse (p/10,l); 
          }
}
