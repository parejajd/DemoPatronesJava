public class Virus extends Patojen {
    public Virus(Humano humano, int position) {
        super();
        this.owner = humano;
        this.id = position;
        this.name = "RJ45";
        this.status = "waiting";
        this.replicas = 0;
        this.history = new CommandsController();
    }

    @Override
    public Patojen initializeVirus(int daysAfterInfection) {
        if(this.status.equals("waiting"))
        {
            this.status = "Initialized";
            owner.printMessage(this.id + " initialized (" + this.name + ") - (" + this.status + ")");
            this.history.add(new FiebreCommand(owner, this));
            this.history.add(new TosCommand(owner, this));
            this.history.add(new BroteCommand(owner, this));
        }
        else if(this.status.equals("Initialized"))    
            owner.printMessage(this.id + " already initialized (" + this.name + ") - (" + this.status + ")");

        return this;
    }

    @Override
    public void executeVirus() {
        if (this.status.equals("Initialized"))  
        {
            owner.printMessage(this.id + " executing (" + this.name + ") - (" + this.status + ")");
            for (Command command : this.history.get()) {
                command.execute();   
            }
        }
        else
            owner.printMessage(this.id + " is not ready (" + this.name + ") - (" + this.status + ")");
    }

    @Override
    public Patojen cloneVirus() {
        this.replicas++;
        int newId = id + this.replicas;
        Patojen newVirus=new Virus(owner, newId);
        newVirus.status = this.status;

        if(this.history != null && this.history.isEmpty()==false)
        {
            newVirus.history.add(new FiebreCommand(owner, newVirus));
            newVirus.history.add(new TosCommand(owner, newVirus));
            newVirus.history.add(new BroteCommand(owner, newVirus));
        }

        owner.printMessage(newId + " cloned (" + newVirus.name + ") - (" + newVirus.status + ")");
        return newVirus;
    }
}
