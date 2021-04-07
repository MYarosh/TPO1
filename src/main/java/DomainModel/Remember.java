package DomainModel;

import java.util.Random;

public class Remember implements Memorable {
    @Override
    public Boolean remember() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
