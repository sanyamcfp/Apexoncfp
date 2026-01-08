package Logical_Reasoning.Strings;
public class AdjacentSwap {
    public static void main(String[] args) {

        String s = "chitkara university";
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length - 1; i += 2) {

            // If current or next is space, just print current and move one step
            if (ch[i] == ' ' || ch[i + 1] == ' ') {
                System.out.print(ch[i]);
                i--;
                continue;
            }

            System.out.print(ch[i + 1]);
            System.out.print(ch[i]);
        }

        // Print last character if length is odd
        if (ch.length % 2 != 0)
            System.out.print(ch[ch.length - 1]);
    }
}
