package task2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Exercise1Task2Test {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(10);
	// The timeout is to avoid infinite loops.

	@Test
	public void test1() {
		List<String> list1 = Arrays.asList("SELECT", "*", "FROM", "SELECTion", ";");
		List<String> results1 = TokenScanner.scanner("SELECT * FROM SELECTion;");
		assertEquals(list1, results1);
	}

	@Test
	public void test2() {
		List<String> list = Arrays.asList("from", "SELECT", "where", "UPDATE");
		List<String> results = TokenScanner.scanner("from SELECT where UPDATE");
		assertEquals(list, results);
	}

	@Test
	public void test3() {
		List<String> wrong = null;
		List<String> results2 = TokenScanner.scanner("ADD v@r;");
		assertEquals(wrong, results2);
	}
	@Test
	public void test4() {
		List<String> poggers = Arrays.asList("fuchs", "du", "hast", ",", ",", ",", ",", ",", ",", "die",
				"Ganz", "gestohlendlf", "*", ";", ";", ";", "LKJLOIOKJ","*",",",";");
		List<String> results3 = TokenScanner.scanner("fuchs du hast,,,,,, die Ganz gestohlendlf *;;;LKJLOIOKJ*,;");
		assertEquals(poggers, results3);
	}

}