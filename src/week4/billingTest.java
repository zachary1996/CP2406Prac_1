package week4;

import org.junit.jupiter.api.Test;

class billingTest {
    @Test
    public void computeBillCheck1() {
        billing bill = new billing();
        System.out.println(bill.computeBill(50.0));
    }

    @Test
    public void computeBillCheck2() {
        billing bill = new billing();
        System.out.println(bill.computeBill(50.0, 5));
    }

    @Test
    public void computeBillCheck3() {
        billing bill = new billing();
        System.out.println(bill.computeBill(50.0, 5, 50.0));
    }
}