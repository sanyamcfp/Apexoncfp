package Logical_Reasoning.Strings;

import java.util.Arrays;

class SortWords {
    public static void main(String[] args) {
        String str = "chitkara university";
        String[] words = str.split(" ");

        Arrays.sort(words);

        for (String w : words) {
            System.out.print(w + " ");
        }
    }
}

