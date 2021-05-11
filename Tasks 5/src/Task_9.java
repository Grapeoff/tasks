import java.util.Locale;

public class Task_9 {
    public static void main(String[] args){
        System.out.println(correctTitle("jOn SnoW, kINg IN thE noRth."));
        System.out.println(correctTitle("sansa stark, lady of winterfell."));
        System.out.println(correctTitle("TYRION LANNISTER, HAND OF THE QUEEN."));
    }

    static String correctTitle(String text) {
        String[] words = text.split(" ");
        String res = "";

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            if (words[i].equals("and") || words[i].equals("the") || words[i].equals("of") || words[i].equals("in")) {
                res += words[i];
            } else if (words[i].indexOf("-") != -1) {
                String[] temp = words[i].split("-");
                res += setUppercase(temp[0]) + "-" + setUppercase(temp[1]);
            } else
                res += setUppercase(words[i]);
            if (i < words.length - 1)
                res += " ";
        }

        return res;
    }

    static String setUppercase(String oops) {
        return oops.substring(0, 1).toUpperCase() + oops.substring(1, oops.length());
    }
}
