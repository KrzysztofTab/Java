public class Loop02 {
    public static void main(String[] args) {
        System.out.println(invertedInscription("leon"));
    }

    private static String invertedInscription(String word) {
        char[] chars = word.toCharArray();
        for (int charIndex = 0; charIndex < chars.length / 2; charIndex++) {
            char tempChars = chars[charIndex];
            int curretnCharFromEndIndex = chars.length - charIndex - 1;
            chars[charIndex] = chars[curretnCharFromEndIndex];
            chars[curretnCharFromEndIndex] = tempChars;
        }
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            result += chars[i];
        }
        return result;
    }

}

