package Solution;

public class StringPractice {

	public static void main(String[] args) {
		// Declare and create a String called name with the exact value 'Fred'
		String name = "Fred";
		// Display its 3rd character - 'e'
		System.out.println(name.charAt(2)); // ////////////
		// System.out.println(name.substring(2,3));
		// In lower case
		System.out.println(name.toLowerCase());
		// In upper case
		System.out.println(name.toUpperCase());
		// Iterate over it
		for (char c : name.toCharArray()) // ////
		{
			System.out.print(c + "\t");
		}
		System.out.println();

		// is true
		System.out.println(name.startsWith("F"));
		// is false
		System.out.println(name.endsWith("z"));
		// 3
		System.out.println(name.indexOf('d'));
		// -1
		System.out.println(name.indexOf('z'));

		String fullname = name + " " + "Bloggs";
		System.out.println(fullname);

		StringBuilder sb = new StringBuilder("Bruce SpringSteen ");
		// sb.append("is the artist ever");
		// sb.insert(25, "greatest ");
		// sb.replace(34, 40, "rock singer" );
		// System.out.println(sb.toString());

		System.out.println(sb.append("is the artist ever")
				.insert(25, "greatest ").replace(34, 40, "rock singer")
				.toString());

	}

}
