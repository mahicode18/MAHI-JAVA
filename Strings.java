public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2; // Concatenation
        System.out.println(str3); // Output: Hello World

        String str4 = "Java Programming";
        int length = str4.length(); // Length of the string
        System.out.println("Length of str4: " + length); // Output: Length of str4: 16

        char ch = str4.charAt(5); // Character at index 5
        System.out.println("Character at index 5: " + ch); // Output: Character at index 5: P

        String substring = str4.substring(5, 16); // Substring from index 5 to 16
        System.out.println("Substring from index 5 to 16: " + substring); // Output: Substring from index 5 to 16: Programming

        boolean contains = str4.contains("Java"); // Check if str4 contains "Java"
        System.out.println("Does str4 contain 'Java'? " + contains); // Output: Does str4 contain 'Java'? true
    }
}
