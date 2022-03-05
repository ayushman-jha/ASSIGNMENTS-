package work;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

	class JunitQ3Test {
	    @Test
	    void Withdraw() throws InsufficientBalanceException {
	        assertThrows(InsufficientBalanceException.class,
	        		() -> JunitQ3.withdraw(800));
	        assertEquals(500, JunitQ3.withdraw(100));
	        System.out.println(JunitQ3.withdraw(100));
	    }

	}