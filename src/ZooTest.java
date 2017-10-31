
public class ZooTest
{

    public static void main(String[] args)
    {
        Gorilla fred = new Gorilla();
        fred.throwSomething();
        fred.throwSomething();
        fred.throwSomething();
        fred.eatBanannas();
        fred.eatBanannas();
        fred.climb();
        fred.displayEnergy();
        
        System.out.println();
        
        Dragon elliot = new Dragon();
        elliot.attackTown();
        elliot.attackTown();
        elliot.eatHumans();
        elliot.eatHumans();
        elliot.eatHumans();
        elliot.fly();
        elliot.fly();
        elliot.displayEnergy();
    }

}
