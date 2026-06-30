import java.io.*;
class Table {
    public static void main(String as[])throws Exception {
        DataInputStream ob=new DataInputStream(System.in); 
        int n,pro;
        System.out.println("Enter a number:");
        n=Integer.parseInt(ob.readLine());
        System.out.println("Multiplication table is : ");
        for (int i=1;i<=10;i++)
        {
          pro=n*i;
          System.out.println(""+n+"*"+i+"="+pro);
        }
    }
}
