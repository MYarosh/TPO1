package DomainModel;

public class Action {

    private String description;
    private int energyCost;

    public Action(String description){
        this(description, 0);
    }

    public Action(String description, int energyCost){
        this.description = description;
        this.energyCost = energyCost;
    }

    public int getEnergyCost() {
        return energyCost;
    }

    public String getDescription() {
        return description;
    }
}
