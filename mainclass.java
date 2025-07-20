 class Animal{
        String name;
        int age;
    
    void sound()
    {
        System.out.println("make a sound");
    }
}
class dog extends Animal
{
    String breed;
    void sound() {
        System.out.println("dog barks");
    }
    void fetch()
    {
        System.out.println("dog is fetching");
    }
}
class cat extends Animal
{
    String color;
    void sound() {
        System.out.println("cat meowww...");
    }

    void climb()
{
    System.out.println("cat climbing");  
}
}

    public class mainclass {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.name = "puppy";
        d1.age = 4;
        d1.breed = "gold";
        d1.sound();
        d1.fetch();

        cat c1 = new cat();
        c1.name = "kutty";
        c1.age = 3;
        c1.color = "white";
        c1.sound();
        c1.climb();
        
    }
}
