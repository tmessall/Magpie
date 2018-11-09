/**
 * A program to allow students to try out different String methods.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer {

	public static void main(String[] args) {
		String sample = "The quick brown fox jumped over the lazy dog.";

		// Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println("sample.indexOf(\"quick\") = " + position);
		int notFoundPsn = sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);

		// Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println("sample.toLowerCase() = " + lowerCase);
		System.out.println("After toLowerCase(), sample = " + sample);

		// Try other methods here:

		int pos = sample.indexOf("o", 0);
		int pos1 = sample.indexOf("o", 10);
		int pos2 = sample.indexOf("o", 15);
		int pos3 = sample.indexOf("o", 20);
		System.out.println("sample.indexOf(\"o\") = " + pos);
		System.out.println("sample.indexOf(\"o\") = " + pos1);
		System.out.println("sample.indexOf(\"o\") = " + pos2);
		System.out.println("sample.indexOf(\"o\") = " + pos3);
	}

}
