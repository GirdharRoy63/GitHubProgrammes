import java.io.*;
class Q100
 {
  public static void main(String as[])throws Exception
   {
     DataInputStream ob=new DataInputStream(System.in);
     String str1,str2="",str3="";
     int len1,len2,count=0,hold1=0,hold2=0;
     System.out.println("Enter a String : ");
     str1=ob.readLine();
     str1=str1.trim();
     str1=str1+" ";
     len1=str1.length();
     System.out.println("Sorting words by length : ");
     for(int i=0;i<len1;i++)
     {
        char c=str1.charAt(i);
        if(c==' ')
            count++;
    }
    int ar1[]=new int[count];
    String ar2[]=new String[count];
     for(int i=0;i<len1;i++)
     {
        char c=str1.charAt(i);
        if(c!=' ')
            str2=str2+c;
        else
        {
            len2=str2.length();
            ar1[hold1++]=len2;
            ar2[hold2++]=str2;
            str2="";
        }
     }
     for(int i=0;i<hold1;i++)
     {
       for(int j=i+1;j<hold1;j++)
        {
            if(ar1[i]>ar1[j])
                {
                    int t=ar1[i];
                    ar1[i]=ar1[j];
                    ar1[j]=t;
                    String t1=ar2[i];
                    ar2[i]=ar2[j];
                    ar2[j]=t1;
                }
           }
        }
      for(int i=0;i<hold2;i++)
                System.out.print(ar2[i]+" ");
    }
  }
