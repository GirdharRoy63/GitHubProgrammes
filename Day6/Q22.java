import java.io.*;
class Q22
 {
  public static void main(String as[])throws Exception
   {
    DataInputStream ob=new DataInputStream(System.in);
    String str1="",str2="",str3="";
    int i=0,j1,k,num1,num2,sum1=0,hold1=0,hold2=-1;
    double sum2=0.0;
    System.out.println("Enter a Binary Number : ");
    str1=ob.readLine();
    for(int j=0;j<str1.length();j++)
    {
        char c=str1.charAt(j);
        if(!(c=='0'||c=='1'||c=='.'))
        {
          System.out.println("Entered number is not Binary ");
          System.exit(0);      
        }
      }
    for(j1=0;j1<str1.length();j1++)
    {
        char c=str1.charAt(j1);
        if(c=='.')
        {
          i=str1.indexOf('.');
          break;
        }
    }
    if(j1==str1.length())
    {
        num1=Integer.parseInt(str1);
        while(num1>0)
       {
          int j=num1%10;
          sum1=sum1+j*(int)(Math.pow(2,hold1++));
          num1=num1/10;
        }
        System.out.println("Corresponding Decimal Number is :\n"+sum1);
    }

    else
    {
     for(k=0;k<i;k++)
     {
        char c=str1.charAt(k);
        if(!(c=='0'||c=='1'))
        {
        System.out.println("Entered number is not binary ");
        break;
        }
      }
      if(k==i)
     {
      for(int j=0;j<i;j++)
      {
        char c=str1.charAt(j);
        str2=str2+c;
      }
   num1=Integer.parseInt(str2);
     while(num1>0)
     {
       int j=num1%10;
       sum1=sum1+j*(int)(Math.pow(2,hold1++));
       num1=num1/10;
     }
     for(int j=i+1;j<str1.length();j++)
      {
        char c=str1.charAt(j);
        str3=str3+c;
      }
       num2=Integer.parseInt(str3);
       hold2=-(str3.length());
        while(num2>0)
       {
        int j=num2%10;
        sum2=sum2+j*(Math.pow(2,hold2++));
        num2=num2/10;
        }
      System.out.println("Corresponding Decimal number is : "+(sum1+sum2));
      }
    }
   }
 }
