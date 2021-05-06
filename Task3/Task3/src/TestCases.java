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

}
