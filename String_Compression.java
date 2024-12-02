class String_Compression{
    public static void main(String[] args) {
        String input = "aaabbc";
        String compressed = compressString(input);
        System.out.println(compressed);  // Output: a3b2c1
    }

    static String compressString(String str) {
        // Check for empty string
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        // Iterate through the string
        for (int i = 1; i < str.length(); i++) {
            // If the current character is the same as the previous one, increase the count
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                // Append the previous character and its count to the compressed string
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1;  // Reset count for the new character
            }
        }

        // Append the last character and its count
        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);

        // Convert StringBuilder to string
        return compressed.toString();
    }
}
