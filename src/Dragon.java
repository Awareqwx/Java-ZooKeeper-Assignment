
public class Dragon extends Mammal //Pretty sure dragons aren't mammals, but whatever
{

    public Dragon()
    {
        energy = 300;
    }
    
    public void fly()
    {
        System.out.println("Flap Flap Flap!");
        energy -= 50;
    }
    
    public void eatHumans()
    {
        //System.out.println("<insert screams of terror here>");
        energy += 25;
    }
    
    public void attackTown()
    {
        System.out.println("Fwoosh!");
        energy -= 100;
    }

}
