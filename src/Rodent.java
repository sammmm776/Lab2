public class Rodent extends Organism
{
    public Rodent(String name)
    {
        super(name);
    }

    private int hunger = 0;

    @Override
    public void liveOneDay(Ecosystem ecosystem)
    {
        Plant victim = ecosystem.getRandomOrganism(Plant.class);
        if (victim != null)
        {
            eat(victim);
            ecosystem.removeOrganism(victim);
            hunger = 0;
        }
        else
        {
            hunger++;
            System.out.printf("No food today for %s. Hunger level: %d\n", this.getName(), hunger);
            if (hunger > 3)
            {
                System.out.printf("%s has starved to death...\n", this.getName());
                ecosystem.removeOrganism(this);
            }
        }
    }

    private void eat(Plant plant)
    {
        System.out.printf("%s eats %s\n", this.getName(), plant.getName());
    }
}
