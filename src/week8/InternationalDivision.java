package week8;

public class InternationalDivision extends Division {
    private String country;
    private String language;

    InternationalDivision(String divisionName, int accountNum, String country, String language) {
        super(divisionName, accountNum);
        this.country = country;
        this.language = language;
    }

    public void display() {
        System.out.println("Division name: " + divisionName + "\naccount number: " + accountNum +
                "\nCountry: " + country + "\nLanguage: " + language + "\n");
    }
}
