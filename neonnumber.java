import java.util.Scanner;
public class neonnumber
{
    public static void main(String[] args) 

    {
        Scanner in = new Scanner(System.in);      
        int n = in.nextInt();
        int a=0,i=0,n1=n*n;
        double b=0,c=0,d=0;
        for(;n1>0;)
        {
            a=n1%10;
            c=c+a;
            n1=n1/10;
        }
        if(c==n)
        System.out.println("NEON NUMBER");
        else
        System.out.println("NOT NEON NUMBER");

    }
}

