package Logical_Reasoning.Strings;
class SwapWords {
    public static void main(String[] args) {
        String str = "chitkara university";

        String[] words = str.split(" ");
        String result = words[1] + " " + words[0];

        System.out.println(result);
    }
}
