package demo2;
public class finaldemo extends final1 {
    final int speedlimit = 90;
    void run()
    {
        //speedlimit = 40;
        System.out.println("Variable = "  + speedlimit);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
finaldemo obj = new finaldemo();
obj.run();
    }

}

class final1
{
    void run()
    {
        System.out.println(" running from parent class");
    }
}
