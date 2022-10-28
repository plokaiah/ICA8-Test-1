import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class urinalsTest {

		@Test
		void test3() {
			urinals bs = new urinals();
			String s = "1001";
			assertEquals(true,bs.validateString(s));
			System.out.println("====== PREM RAJ LOKAIAHGARI == TEST ONE EXECUTED AND PASSED =======");  
		}
		
		@Test
		void testing3() {
			urinals bs = new urinals();
			String s = "224";
			assertEquals(false,bs.validateString(s));
			System.out.println("====== PREM RAJ LOKAIAHGARI == TEST TWO EXECUTED AND PASSED =======");  
		}
		

}
