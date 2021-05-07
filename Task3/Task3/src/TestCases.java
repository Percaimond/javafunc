import static org.junit.Assert.*;

import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

public class TestCases {

	private class MyErrorListener extends BaseErrorListener {
		boolean hasSyntaxError = false;

		@Override
		public void syntaxError(Recognizer r, Object symbol, int line, int pos, String msg, RecognitionException e) {
			hasSyntaxError = true;
		}
	}

	private void testInput(String input, boolean expectError, int expectedTokens) {
		Task3Lexer lex = new Task3Lexer(CharStreams.fromString(input));
		TestCases.MyErrorListener errorListener = new MyErrorListener();
		lex.addErrorListener(errorListener);
		List<? extends Token> allTokens = lex.getAllTokens();
		assertEquals(expectedTokens, allTokens.size());
		assertEquals(expectError, errorListener.hasSyntaxError);
	}

	@Test
	public void test0() {
		String input = "@#$#%";
		testInput(input, true, 0);
	}

	@Test
	public void test1() {
		String input = "SELECT x FROM y";
		testInput(input, false, 4);
	}

	@Test
	public void test2() {
		String input = "SELECT";
		testInput(input, false, 1);
	}

	@Test
	public void test3() {
		String input = "update foo; ##";
		testInput(input, true, 3);
	}

	@Test
	public void test4(){
		String input = "UPDATE RULE76767;;poggers";
		testInput(input, false, 6);
	}

	@Test
	public void test5(){
		String input = ";;;;;;;;;\nokidoki\nokimoke234234";
		testInput(input, false,12);
	}

	@Test
	public void test6(){
		String input = "UPDATEä RULE ;* ";
		testInput(input, true,4);
	}

	@Test
	public void test7(){
		String input = "fromfromfromfromfrom";
		testInput(input,false ,1);
	}

	@Test
	public void test8(){
		String input = "SELECT 567 FROM where X Y;";
		testInput(input,false ,7);
	}

	@Test
	public void test9(){
		String input = "***********";
		testInput(input, false,11);
	}

}
