package pack1;
import pack1.hello01;

class mano02
{
    void show_value()
    {
        hello01 h1=new hello01();
        System.out.println(h1.a);
    }
}

public class hello02
{
    public static void main(String[] args) {
        mano02 m2=new mano02();
        m2.show_value();
    }
}