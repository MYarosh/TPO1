package DomainModel;


public class Human {

    private String name, surname;
    private int energy;
    private Remember remember = new Remember();

    public Human(String name) {
        this(name, null, 0);
    }

    public Human(String name, String surname) {
        this(name, surname, 0);
    }

    public Human(String name, String surname, int energy){
        this.energy = energy;
        this.name = name;
        this.surname = surname;
    }

    public void relax(Action action) {
        energy += action.getEnergyCost();
        System.out.println(this.name + "" + this.surname + " отдохнул выполнив действие: " + action.getDescription());
        if (remember.remember()) System.out.println("Действие выполнено быстро.");
        else System.out.println("Действие выполнено медленно.");
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }
}
