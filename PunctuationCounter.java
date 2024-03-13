public class PunctuationCounter {
    public static void main(String[] args) {
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";

        char[] punctuationMarks = {'.', ',', '-', '!', '?'};

        int[] counts = new int[punctuationMarks.length];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            for (int j = 0; j < punctuationMarks.length; j++) {
                if (ch == punctuationMarks[j]) {
                    counts[j]++;
                }
            }
        }

        System.out.println("Punctuation Marks Counts:");
        System.out.println("-------------------------");
        System.out.println("Punctuation Mark\tCount");
        System.out.println("-------------------------");

        for (int i = 0; i < punctuationMarks.length; i++) {
            System.out.println(punctuationMarks[i] + "\t\t\t" + counts[i]);
        }
    }
}