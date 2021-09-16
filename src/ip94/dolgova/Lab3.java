package ip94.dolgova;

public class Lab3 {

    public static void main(String[] args) {
	int zalikova = 9410;

	// Type - string
	int C3 = zalikova % 3;

	// Number of sentences containing a word
	int C17 = zalikova % 17;

	String text = "I had never seen a house on fire before, so, one evening when I heard fire engines with loud alarm bells rushing past my house. I quickly ran out and, a few streets away, joined a large crowd of people. We could see the fire only from a distance because the police would not allow any one near the building on fire. What a terrible scene I saw that day! Huge flames of fire were coming out of each floor, and black and thick smoke spread all around. Four fire engines were engaged and the firemen in their uniform were playing the hose on various parts of the building. Then the tall ladders of the fire engine were stretched upwards. Some firemen climbed up with hoses in their hands. The continuous flooding brought the fire under control but the building was completely destroyed.";
	String[] words = { "I", "never", "a", "fire", "hello" };

	// Error handling
	if (words.length == 0) {
	    System.out.println("There are no words to check");
	} else {

	    String[] textSplit = text.split("[.!?]");

	    String[][] textWords = new String[textSplit.length][];

	    for (int i = 0; i < textSplit.length; i++) {
		// Delete spaces on ends, remove commas, split on words
		textWords[i] = textSplit[i].trim().replaceAll("\\p{P}", "").split(" ");
	    }

	    int[] numSentences = new int[words.length];

	    for (int k = 0; k < words.length; k++) {
		label: for (int i = 0; i < textWords.length; i++) {
		    for (int j = 0; j < textWords[i].length; j++) {
			if (textWords[i][j].equalsIgnoreCase(words[k])) {
			    numSentences[k]++;
			    // if the word is found in a sentence - go to the next sentence
			    continue label;
			}
		    }
		}
	    }

	    for (int i = 0; i < words.length; i++) {
		System.out.println("Word " + words[i] + " is in " + numSentences[i] + " sentences.");
	    }
	}
    }

}
