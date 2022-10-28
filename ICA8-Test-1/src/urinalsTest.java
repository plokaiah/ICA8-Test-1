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
			urinals bs = new urinals();
			String s = "10001";
			assertEquals(1,bs.countUrinals(s));
			System.out.println("====== PREM RAJ LOKAIAHGARI == TEST FIVE EXECUTED=======");  
		}
		@Test
		void test6() {
			urinals bs = new urinals();
			String s = "000000";
			assertEquals(3,bs.countUrinals(s));
			System.out.println("====== PREM RAJ LOKAIAHGARI == TEST SIX EXECUTED=======");  
		}
		@Test
		void test7() {
			urinals bs = new urinals();
			String s = "001";
			assertEquals(1,bs.countUrinals(s));
			System.out.println("====== PREM RAJ LOKAIAHGARI == TEST SEVEN EXECUTED=======");  
		}
		@Test
		void test8() {
			urinals bs = new urinals();
			String s = "000000";
			assertEquals(3,bs.countUrinals(s));
			System.out.println("====== PREM RAJ LOKAIAHGARI == TEST EIGHT EXECUTED=======");  
		}
}
