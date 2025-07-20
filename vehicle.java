class vehicle1
{
    String brand;
    int Year;

    void startengine()
    {
        System.out.println("engine started");
    }
    
}
class car extends vehicle1
{
    String fueltype;

    void startengine()
    {
        System.out.println("car engine started");
    }
    void drive()
    {
        System.out.println("car is driving");
    }
}
class truck extends vehicle1
{

    String loadcapacity;
    void startengine()
    {
        System.out.println("truck engine started");
    }
    void haul()
    {
        System.out.println("truck is hauling");
    }


} 
public class vehicle {
    public static void main(String [] args)
    {
        car c1 = new car();
        c1.fueltype = "petrol";
        System.out.println(c1.fueltype);
        c1.startengine();
        c1.drive();
        c1.Year = 2007;
        c1.brand = "tata";
        System.out.println(c1.Year);
        System.out.println(c1.brand);

        truck t1 = new truck();
        t1.loadcapacity = "10000kg";
        t1.startengine();
        t1.haul();
        t1.Year = 2025;
        t1.brand = "asok";
        System.out.println(t1.Year);
        System.out.println(t1.brand);

    }
}
