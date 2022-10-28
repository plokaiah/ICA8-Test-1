import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class urinalsTest {

		@Test
		void test1() {
			urinals bs = new urinals();
			String s = "1001";
			assertEquals(true,bs.validateString(s));
			System.out.println("====== PREM RAJ LOKAIAHGARI == TEST ONE EXECUTED=======");  
		}
		
		@Test
		void test2() {
			urinals bs = new urinals();
			String s = "224";
			assertEquals(false,bs.validateString(s));
			System.out.println("====== PREM RAJ LOKAIAHGARI == TEST TWO EXECUTED=======");  
		}
		@Test
		void test3() {
			urinals bs = new urinals();
			String s = "000000";
			assertEquals(true,bs.validateString(s));
			System.out.println("====== PREM RAJ LOKAIAHGARI == TEST THREE EXECUTED=======");  
		}
		@Test
		void test4() {
			urinals bs = new urinals();
			String s = "011";
			assertEquals(true,bs.validateString(s));
			System.out.println("====== PREM RAJ LOKAIAHGARI == TEST FOUR EXECUTED=======");  
		}
		
		@Test
		void test5() {
			urinals u = new urinals();
			String s = "10001";
			assertEquals(2,u.countUrinals(s));
			System.out.println("====== PREM RAJ LOKAIAHGARI == TEST FIVE EXECUTED=======");  
		}
}
