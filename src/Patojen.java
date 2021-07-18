public abstract class Patojen  {
    public int id;
    public String name;
    public String status;
    public Humano owner;
    public int replicas;
    public CommandsController history;
    public abstract Patojen initializeVirus(int daysAfterInfection);
    public abstract void executeVirus();    
    public abstract Patojen cloneVirus();
}
