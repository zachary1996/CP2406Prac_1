package week8;

public class Participant {
    private String name;
    private int age;
    private String streetAddress;

    Participant(String name, int age, String streetAddress) {
        this.name = name;
        this.age = age;
        this.streetAddress = streetAddress;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nAddress: " + streetAddress;
    }

    public boolean equals(Participant otherParticipant) {
        boolean result;
        result = (name.equals(otherParticipant.name)) && (age == otherParticipant.age) && (streetAddress.equals(otherParticipant.streetAddress));
        return result;
    }
}
