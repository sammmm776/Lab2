public abstract class Organism
{

    protected String name;

    public Organism(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public abstract void liveOneDay(Ecosystem ecosystem);
}
