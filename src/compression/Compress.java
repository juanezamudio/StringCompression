package compression;

public class Compress {

	/**
	 * Compresses a string by creating a string that shows
	 * total number of appearances of a character followed by that character
	 * @param input the string to be compressed
	 * @return the compressed string
	 */

	static String runLengthEncode(String input) {

		int total = 0;
		StringBuilder helper = new StringBuilder();
		String result = "";
		char last;
		
		if (input.isEmpty()) {
			
			return result;
			
		} else {
			last = input.charAt(0);
			
			for (int i = 0; i < input.length(); i++) {

				if (input.charAt(i) == last) {
					total++;
				} else {
					helper.append(total);
					helper.append(last);
					last = input.charAt(i);
					total = 1;
				}
			}
		}

		helper.append(total);
		helper.append(last);

		result = helper.toString();

		return result;

	}

	public static void main(String[] args) {
		System.out.println(Compress.runLengthEncode("GGGGGrrrrrrrrrrrrrrt"));
		System.out.println(Compress.runLengthEncode(""));
	}

}
