package week7;

public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold pet = new ItemSold();
        PetSold dog = new PetSold();
        pet.setInvoiceNum(1234);
        pet.setDescription("lovely golden retriever puppy");
        pet.setPrice(500);
        dog.setVaccinated(true);
        dog.setHouseBroken(false);
        dog.setNeutered(false);
        pet.display();
        dog.display();


    }
}
