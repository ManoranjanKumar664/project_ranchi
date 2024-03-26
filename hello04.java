import java.util.Scanner;

class mano01
{
    public void cal()
    {
     Scanner mano=new Scanner(System.in);
     System.out.println("enter the first number");
     int a=mano.nextInt();
     System.out.println("enter the second number");
     int b=mano.nextInt();
     System.out.println("enter the operator:");
     int ch=mano.next().charAt(0);
     if(ch=='+')
     {
        int l=a+b;
        System.out.println("sum="+l);
     }
     else if(ch=='-')
     {
        int l=a-b;
        System.out.println("difference="+l);
     }
     else if(ch=='*')
     {
        int l=a*b; 
        System.out.println("product="+l);
     }
     else if(ch=='/')
     {
        int l=a/b;
        System.out.println("quotient="+l);
     }
    }
}

public class hello04
{
    public static void main(String[] args) {
        // mano m=new mano();
        mano01 m=new mano01();
        m.cal();
    }
}
