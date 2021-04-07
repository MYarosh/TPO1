package DomainModel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ActionTest {

    @Test
    public void make() {
        String description = "desc";
        int energyCost = 15;

        Action action = new Action(description, energyCost);

        assertEquals(description, action.getDescription());
        assertEquals(energyCost, action.getEnergyCost());
    }
}
