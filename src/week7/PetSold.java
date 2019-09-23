package week7;

public class PetSold extends ItemSold {
    private Boolean vaccinated;
    private Boolean neutered;
    private Boolean houseBroken;

    private Boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    private Boolean getNeutered() {
        return neutered;
    }

    public void setNeutered(Boolean neutered) {
        this.neutered = neutered;
    }

    private Boolean getHouseBroken() {
        return houseBroken;
    }

    public void setHouseBroken(Boolean houseBroken) {
        this.houseBroken = houseBroken;
    }

    @Override
    public void display() {
        if (getHouseBroken())
            System.out.println("the animal is housebroken");
        else
            System.out.println("the animal is not housebroken");
        if (getVaccinated())
            System.out.println("the animal is vaccinated");
        else
            System.out.println("the animal is not vaccinated");
        if (getNeutered())
            System.out.println("the animal is neutered");
        else
            System.out.println("the animal is not neutered");
    }
}
