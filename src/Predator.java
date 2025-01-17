public class Predator extends Organism {
    public Predator(String name) {
        super(name);
    }

    @Override
    public void liveOneDay(Ecosystem ecosystem) {
        Rodent victim = ecosystem.getRandomOrganism(Rodent.class);
        if (victim != null) {
            eat(victim);
            ecosystem.removeOrganism(victim);
        } else {
            System.out.printf("No food today for %s\n", this.getName());
        }
    }

    private void eat(Rodent herbivore) {
        System.out.printf("%s eats %s\n", this.getName(), herbivore.getName());
    }
}
