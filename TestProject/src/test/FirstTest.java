package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FirstTest {

	@Test
	void simpleTest() {
		fail("Not yet implemented");
	}

	@Test
	void myFirstTest() {
		assertEquals(2, 1 + 1);
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	void palindromes(String candidate) {
	    assertTrue(isPalindrome(candidate));
	}
	
	@RepeatedTest(3)
	void repeatedTest(TestInfo testInfo) {
	    System.out.println("Executing repeated test");
	  
	    assertEquals(2, Math.addExact(1, 1), "1 + 1 should equal 2");
	}
	
	
	@RepeatedTest(3)
	void repeatedTestWithRepetitionInfo(RepetitionInfo repetitionInfo) {
	    System.out.println("Repetition #" + repetitionInfo.getCurrentRepetition());
	  
	    assertEquals(3, repetitionInfo.getTotalRepetitions());
	}
	
    // Metodo che verifica se una stringa è un palindromo
    public static boolean isPalindrome(String str) {
        // Rimuovi spazi e converti tutto in minuscolo per una verifica senza distinzioni tra maiuscole e minuscole
        String cleanedStr = str.replaceAll("\\s", "").toLowerCase();

        // Verifica se la stringa invertita è uguale alla stringa originale
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }
}
