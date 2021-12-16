package inheritance.example3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testPerson() {
        Actor actor = new Actor("Jim Carrey");
        Waiter waiter = new Waiter("Bill Johsnon");
        assertThat(actor).isInstanceOf(Person.class);
        assertThat(waiter).isNotInstanceOf(Vehicle.class);
    }

}