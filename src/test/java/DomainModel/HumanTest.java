package DomainModel;

import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void relax() {
        int diff = 100;

        String description = "desc";
        int energyCost = 15;

        Action action = new Action(description, energyCost);
        Human human = new Human("Иван", "Иванов", energyCost + diff);
        int initEnergy = human.getEnergy();

        human.relax(action);

        assertEquals(human.getEnergy() - initEnergy, energyCost);
    }
}
