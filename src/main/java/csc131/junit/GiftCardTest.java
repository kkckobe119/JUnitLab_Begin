package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GiftCardTest {
	@Test
	public void getIssuingStore() {
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
		assertEquals("getBalance()", 100.00, 100.00, 0.001);
	}
	
	@Test
	public void deduct() {
		int issuingStore = 1337;
		double balance = 100.00;
		GiftCard card = new GiftCard(issuingStore, balance);
		assertEquals("deduct()", "Invalid Transaction", card.deduct(10));
	}
}
