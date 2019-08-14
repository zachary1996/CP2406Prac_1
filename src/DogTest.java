import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {
    @Test
    void testDefault() {
        Dog dog = new Dog();
        assertEquals(null, dog.name);
        assertEquals(0, dog.age);
        assertEquals(null, dog.breed);
        assertEquals(null, dog.shotStatus);
    }
}