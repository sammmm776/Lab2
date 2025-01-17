public class Main
{
    public static void main(String[] args)
    {
        Ecosystem ecosystem = new Ecosystem();

        ecosystem.addOrganism(new Plant("Corn1"));
        ecosystem.addOrganism(new Plant("Corn2"));
        ecosystem.addOrganism(new Plant("Corn3"));


        ecosystem.addOrganism(new Rodent("Mouse1"));
        ecosystem.addOrganism(new Rodent("Mouse2"));
        ecosystem.addOrganism(new Rodent("Mouse3"));
        ecosystem.addOrganism(new Rodent("Mouse4"));
        ecosystem.addOrganism(new Rodent("Mouse5"));
        ecosystem.addOrganism(new Rodent("Mouse6"));
        ecosystem.addOrganism(new Rodent("Mouse7"));
        ecosystem.addOrganism(new Rodent("Mouse8"));

        ecosystem.addOrganism(new Predator("Owl"));
        ecosystem.addOrganism(new Predator("Fox"));


        ecosystem.simulate(8);
    }
}