import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnMismatchedWords {
    public static void main(String[] args) {
        String str1 = "Firstly this is the first string";
        String str2 = "Next is the second string";
        String[] result1 = returnMismatchedWords(str1, str2);
//        output: ["Firstly", "this", "first", "Next", "second"]
        System.out.println(Arrays.toString(result1));

        String str11 = "";
        String str22 = "";
        String[] result11 = returnMismatchedWords(str11, str22);
//        output: []
        System.out.println(Arrays.toString(result11));

        String str111 = "";
        String str222 = "This is the second string";
        String[] result111 = returnMismatchedWords(str111, str222);
//        output: ["This","is","the","second","string"]
        System.out.println(Arrays.toString(result111));

        String str1111 = "This is the first string";
        String str2222 = "This is the second string";
        String[] result1111 = returnMismatchedWords(str1111, str2222);
//        output: ["first", "second"]
        System.out.println(Arrays.toString(result1111));

        String str11111 = "This is the first string extra";
        String str22222 = "This is the second string";
//        output: ["first", "extra", "second"]
        String[] result11111 = returnMismatchedWords(str11111, str22222);
        System.out.println(Arrays.toString(result11111));

        String str111111 = "This is the first text";
        String str222222 = "This is the second string";
        String[] result111111 = returnMismatchedWords(str111111, str222222);
//        output: ["first", "text", "second", "string"]
        System.out.println(Arrays.toString(result111111));
    }

    public static String[] returnMismatchedWords(String str1, String str2) {
        List<String> list1 = new ArrayList<>(Arrays.asList(str1.split(" ")));
        List<String> list2 = new ArrayList<>(Arrays.asList(str2.split(" ")));

        List<String> mismatched = new ArrayList<>();

        for (String s : list1) {
            if (!list2.contains(s)) {
                mismatched.add(s);
            }
        }

        for (String s : list2) {
            if (!list1.contains(s)) {
                mismatched.add(s);
            }
        }

        return mismatched.toArray(new String[0]);
    }
}
