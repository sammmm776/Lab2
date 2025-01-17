public class Predator extends Organism
{
    public Predator(String name)
    {
        super(name);
    }

    private int hunger = 0;

    @Override
    public void liveOneDay(Ecosystem ecosystem)
    {
        Rodent victim = ecosystem.getRandomOrganism(Rodent.class);
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

    private void eat(Rodent herbivore)
    {
        System.out.printf("%s eats %s\n", this.getName(), herbivore.getName());
    }
}
