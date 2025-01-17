import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ecosystem
{
    final private List<Organism> organisms;

    public Ecosystem()
    {
        organisms = new ArrayList<>();
    }

    public void addOrganism(Organism organism)
    {
        organisms.add(organism);
    }

    public void removeOrganism(Organism organism)
    {
        organisms.remove(organism);
    }

    public <T extends Organism> T getRandomOrganism(Class<T> organismType)
    {
        List<T> filteredOrganisms = filterOrganismsByType(organismType);
        if (filteredOrganisms.isEmpty())
        {
            return null;
        }

        return filteredOrganisms.get(new Random().nextInt(filteredOrganisms.size()));
    }

    private <T extends Organism> List<T> filterOrganismsByType(Class<T> organismType)
    {
        List<T> organismsOfType = new ArrayList<>();
        for (Organism organism : organisms)
        {
            if (organismType.isInstance(organism))
            {
                organismsOfType.add(organismType.cast(organism));
            }
        }
        return organismsOfType;
    }

    private void simulateOneDay()
    {
        List<Organism> organismsCopy = new ArrayList<>(organisms);
        for (Organism organism : organismsCopy)
        {
            organism.liveOneDay(this);
        }
    }

    public void simulate(Integer nDays)
    {
        for (int i = 0; i < nDays; i++)
        {
            System.out.printf("Day %d\n", i + 1);
            this.simulateOneDay();
        }
        System.out.println("\nDay ended\n");
    }
}