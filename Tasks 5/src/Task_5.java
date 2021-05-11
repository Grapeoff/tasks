import java.util.ArrayList;

public class Task_5 {
    public static void main(String[] args) {
        printArray(sameVowelGroup(new String[] {"toe", "ocelot", "maniac"}));
        printArray(sameVowelGroup(new String[] {"many", "carriage", "emit", "apricot", "animal"}));
        printArray(sameVowelGroup(new String[] {"hoops", "chuff", "bot", "bottom"}));
    }

    static String[] sameVowelGroup(String[] array) {
        String vowels = "aeiouy";
        String trueVowels = "";
        ArrayList<String> array_words = new ArrayList<String>();
        array_words.add(array[0]);

        for (int i = 0; i < array[0].length(); i++) {
            if (vowels.indexOf(array[0].charAt(i)) != -1)
                trueVowels += array[0].charAt(i);
        }

        for (int i = 1; i < array.length; i++) {
            boolean isTrue = true;
            for (int j = 0; j < array[i].length() && isTrue; j++) {
                if (vowels.indexOf(array[i].charAt(j)) != -1 && trueVowels.indexOf(array[i].charAt(j)) == -1)
                    isTrue = false;
            }
            if (isTrue)
                array_words.add(array[i]);
        }

        return array_words.toArray(new String[0]);
    }

    static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
