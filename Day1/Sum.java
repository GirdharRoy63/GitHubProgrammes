import java.io.*;
class Sum {
    public static void main(String as[])throws Exception {
        DataInputStream ob=new DataInputStream(System.in);
        int n,sum=0;
        System.out.println("Enter value of N:");
        n=Integer.parseInt(ob.readLine());
        for(int i=1;i<=n;i++)
          sum+=i;
          System.out.print("Sum of N natural numbers is : " + sum);
    }
}
