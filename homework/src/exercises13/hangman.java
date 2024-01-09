package exercisesRECAP;

/*Solution for exercises 10 recap in 181110 Information Technology**Write a program for the game Hangman**@author:Armin Weichmann*/

import java.util.Scanner;

//------------------------------------------------------------------------------------------------------------------
public class hangman {
	// ensemble of possible words - all key words of Java
	public static final String[] WORDS = { "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR",
			"CLASS", "CONST", "CONTINUE", "DEFAULT", "DOUBLE", "DO", "ELSE", "ENUM", "EXTENDS", "FALSE", "FINAL",
			"FINALLY", "FLOAT", "FOR", "GOTO", "IF", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG",
			"NEW", "NULL", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "SUPER", "SWITCH",
			"SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRUE", "TRY", "VOID", "VOLATILE", "WHILE" };

	// --------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		// Max errors before user loses
		final int MAX_ERRORS = 6;
		// Word to find
		String wordToFind = "";
		// Word found stored in a char array to show progression of user
		String wordFound = "";
		int iErrorsMade = 0;

		Scanner s = new Scanner(System.in);
		// print game rules
		System.out.println("Hangman Game - guess a word out of the keywords of Java");
		System.out.println("You get the word as underscores and need to guess a letter, which appears in the word.");
		System.out.println("If you guessed correct, the letter is filled in and displayed again");
		System.out.println("If the letter is not in the word, your error count increases only");
		System.out.println("You can make " + MAX_ERRORS + " errors max until you guessed the word correct.");
		System.out.println("Otherwise you loose the game.");

		// select randomly 1 word from WORDS
		wordToFind = nextWordToFind();
		wordFound = ""; // generate wordFound with as many _ as the wortToFind has characters
		for (int i = 0; i < wordToFind.length(); i++) {
			wordFound += '_';
		}
		displayWord(wordFound); // display the wordFound with Space between the characters
		// output start information
		System.out.println("Please guess a letter of the word");
		System.out.println("You have " + MAX_ERRORS + " errors left.");
		iErrorsMade = 0; // set ErrorsMade to 0

		while (true) { // loop until break (when word guessed or too many errors
			String cs = s.next(); // next input (line)
			char c = cs.charAt(0); // first character is the one input
			c = Character.toUpperCase(c); // convert to uppercase letter with Character class
			if (checkLetter(c, wordToFind)) { // if letter is part of word (result is true)
				// print confirmation
				System.out.println("Yes. '" + c + "' is part of the word");
				// set letter(s) into wordFound
				wordFound = setLetter(c, wordToFind, wordFound);
				// if wordToFind is the same as wordFound, then end and congratulation
				if (wordToFind.compareTo(wordFound) == 0) {
					displayWord(wordFound);
					System.out.println("Congratulation. You got it.");
					break;
				}
			} else { // letter not part of word
				// print denial
				System.out.println("No. '" + c + "' is not part of the word.");
				++iErrorsMade; // increment errors made and print numbers of errors left
				System.out.println("You have " + (MAX_ERRORS - iErrorsMade) + " errors left.");
				if (iErrorsMade >= MAX_ERRORS) { // if more errors than allowed, end with message
					System.out.println("You loose. The word was " + wordToFind);
					break;
				}
			}
			displayWord(wordFound); // display word, if the game has not ended yet
		}
		s.close();
	}

	// --------------------------------------------------------------------------------------------------------------
	// select a random word from WORDS by generating an integer 0 to WORDS.length-1
	// and
	// accessing the respective element
	public static String nextWordToFind() {
		return WORDS[(int) (Math.random() * WORDS.length)];
	}

	// --------------------------------------------------------------------------------------------------------------
	// print wordFound with one space between the letters
	static void displayWord(String wordFound) {
		String s = "";
		for (int i = 0; i < wordFound.length(); ++i) {
			s += wordFound.substring(i, i + 1) + " ";
		}
		System.out.println(s);
	}

	// --------------------------------------------------------------------------------------------------------------
	// check if the letter c is found in wordToFind
	// return true, if yes, false if not
	static boolean checkLetter(char c, String wordToFind) {
		for (int i = 0; i < wordToFind.length(); ++i) {
			if (wordToFind.charAt(i) == c) {
				return true;
			}
		}
		return false;
	}

	// --------------------------------------------------------------------------------------------------------------
	// replace the underscore with the character c in wordFound
	// at the location, where this character is found in wordToFind
	// (replace all occurences)
	static String setLetter(char c, String wordToFind, String wordFound) {
		for (int i = 0; i < wordToFind.length(); ++i) {
			if (wordToFind.charAt(i) == c) {
				wordFound = wordFound.substring(0, i) + c + wordFound.substring(i + 1);
			}
		}
		return wordFound;
	}
	// --------------------------------------------------------------------------------------------------------------
}


