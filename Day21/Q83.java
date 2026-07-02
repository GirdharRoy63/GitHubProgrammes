import java.io.*;
class Q83
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        String str;
        int vow=0,con=0;
        System.out.println("Enter a String : ");
        str=ob.readLine();
        str=str.toUpperCase();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c!=' ')
              {
                  if(c=='A'|| c=='E'|| c=='I'||c=='O'||c=='U')
                      vow++;
                  else
                     con++;
              }
           }
           System.out.println("Number of vowels in given String are :\n" +vow);
           System.out.println("Number of consonants in given String are :\n" +con);
    }
}
