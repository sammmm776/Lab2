public class Rodent extends Organism {
    public Rodent(String name) {
        super(name);
    }

    @Override
    public void liveOneDay(Ecosystem ecosystem) {
        Plant victim = ecosystem.getRandomOrganism(Plant.class);
        if (victim != null) {
            eat(victim);
            ecosystem.removeOrganism(victim);
        } else {
            System.out.printf("No food today for %s\n", this.getName());
        }
    }

    private void eat(Plant plant) {
        System.out.printf("%s eats %s\n", this.getName(), plant.getName());
    }
}
