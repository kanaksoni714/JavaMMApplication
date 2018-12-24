import static org.junit.Assert.*;

import org.junit.Test;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class MMBankTest {

	@Test(expected = Exception.class)
	public void test() {
		Logger log = Logger.getLogger(MMBank.class.getName());
		BasicConfigurator.configure();
		log.debug("Test Starts");
		MMBank mmBank = new MMSavingAccount(111, null, 1000);
		try {
			mmBank.withdraw(200);
		} catch (Exception e) {
			RuntimeException runtimeException = new RuntimeException();
			runtimeException.initCause(e);
			throw runtimeException;

		}
		assertEquals(800, 0);

	}

	@Test
	public void test1() {
		MMBank mmBank = new MMCurrentAccount(111111, null, 10000);
		try {
			mmBank.deposit(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(9800, 0);
	}
}
