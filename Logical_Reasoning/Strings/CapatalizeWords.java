package Logical_Reasoning.Strings;
class CapitalizeWords {
    public static void main(String[] args) {
        String str = "my name is";
        String[] words = str.split(" ");

        String result = "";

        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }

        System.out.println(result.trim());
    }
}
