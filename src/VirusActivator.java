import java.util.*;

public class VirusActivator extends Patojen {

    private Patojen virus;
    private List<Patojen> viruses;

    public VirusActivator(Humano humano) {
        virus = new Virus(humano, 1);
        viruses = new ArrayList<Patojen>();
        viruses.add(virus);
    }

    @Override
    public Patojen initializeVirus(int daysAfterInfection) {
        if (daysAfterInfection > 5) {
            for (Patojen iPatojen : viruses) {
                iPatojen.initializeVirus(daysAfterInfection);
            }
            return virus;
        }
        return virus;
    }

    @Override
    public void executeVirus() {
        for (Patojen iPatojen : viruses) {
            iPatojen.executeVirus();
        }
    }

    @Override
    public Patojen cloneVirus() {
        Patojen newVirus = this.virus.cloneVirus();
        this.viruses.add(newVirus);
        return newVirus;
    }

}
