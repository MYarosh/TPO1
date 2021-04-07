package DomainModel;

import org.junit.Test;

import static org.junit.Assert.*;


public class RememberTest {

    @Test
    public void remember() {
        Remember remember = new Remember();

        assertNotNull(remember.remember());
    }
}
