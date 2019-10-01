package week8;

public class UseDivision {

    public static void main(String[] args) {
        InternationalDivision division = new InternationalDivision("Hapa", 463738349, "Africa", "yoruba");
        DomesticDivision division1 = new DomesticDivision("Asic", 874874839, "queensland");
        division.display();
        division1.display();

    }
}
