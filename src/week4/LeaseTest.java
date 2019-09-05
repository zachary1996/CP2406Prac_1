package week4;

import org.junit.jupiter.api.Test;

class LeaseTest {
    @Test
    public void basicTest() {
        Lease lease = new Lease();
        lease.setName("joe");
        lease.setApartmentNum(4);
        lease.setMonthlyRent(400);
        lease.setLeaseTerm(3);
        System.out.println("name: " + lease.getName());
        System.out.println("number: " + lease.getApartmentNum());
        System.out.println("monthly rent: " + lease.getMonthlyRent());
        System.out.println("lease term: " + lease.getLeaseTerm());
    }

    @Test
    public void checkAddPetFee() {
        Lease lease = new Lease();
        lease.addPetFee();
        System.out.println("name: " + lease.getName());
        System.out.println("number: " + lease.getApartmentNum());
        System.out.println("monthly rent: " + lease.getMonthlyRent());
        System.out.println("lease term: " + lease.getLeaseTerm());
    }
}