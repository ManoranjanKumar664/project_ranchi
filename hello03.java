import java.util.Scanner;

class mano
{
    public void sum(int m, int n)
    {
        int l=m+n;
        System.out.println("sum="+l);
    }
    void product(int m, int n)
    {
        int l=m*n;
        System.out.println("product="+l);
    }
    void difference(int m, int n)
    {
        if(m>n)
        {
            int l=m-n;
            System.out.println("difference="+l);
        }
        else 
        {
            int l=n-m;
            System.out.println("difference="+l);
        }
    }
    void quotient(int m, int n)
    {
        if(m>n)
        {
            int l=m/n;
            System.out.println("quotient="+l);
        }
        else 
        {
            int l=n/m;
            System.out.println("quotient="+l);
        }
    }
    void remainder(int m, int n)
    {
        if(m>n)
        {
            int l=m%n;
            System.out.println("remainder="+l);
        }
        else
        {
            int l=n%m;
            System.out.println("remainder="+l);
        }
    }

}

public class hello03
{
    public static void main(String[] args) {
        mano m1=new mano();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        System.out.println("enter any character :");
        char ch=sc.next().charAt(0);
        if(ch=='+')
         {
            m1.sum(a, b);
         }
        else if(ch=='-')
        {
            m1.product(a, b);
        }
        else if(ch=='*')
        {
            m1.difference(a, b);
        }
        else if(ch=='/')
        {
            m1.quotient(a, b);
        }
        else if(ch=='%')
        {
            m1.remainder(a, b);
        }
        else
        {
            System.out.println("operator invalid.");
        }
    }
}