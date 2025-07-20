abstract class vehicle
{
   abstract void speed();

   void brand()
   {
    System.out.println("abc brand");
   }

}

class bike extends vehicle
{
    void speed()
    {
        System.out.println("35km");
    }

}

class car extends vehicle
{
    void speed()
    {
        System.out.println("45km");
    }

}


public class abstractex {
    public static void main(String [] args)
    {
        bike b1 = new bike();
        b1.speed();
        b1.brand();

        car c1 = new car();
        c1.speed();
        c1.brand();
        
    }
}
