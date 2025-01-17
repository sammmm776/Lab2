public class Plant extends Organism {

    public Plant(String name) {
        super(name);
    }

    @Override
    public void liveOneDay(Ecosystem ecosystem) {
        ripens();
    }

    private void ripens() {
        System.out.printf("The %s is ripe \n", this.getName());
    }
}
