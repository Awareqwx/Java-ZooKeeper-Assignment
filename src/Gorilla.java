
public class Gorilla extends Mammal
{
    
    public Gorilla()
    {
        super();
    }
    
    public void throwSomething()
    {
        System.out.println("The gorilla threw something!");
        energy -= 5;
    }
    
    public void eatBanannas()
    {
        System.out.println("The gorilla eats a banana and grunts happily");
        energy += 10;
    }
    
    public void climb()
    {
        System.out.println("The gorilla climbed a tree");
        energy -= 10;
    }
    
}
