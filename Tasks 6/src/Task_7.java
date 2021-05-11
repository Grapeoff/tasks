public class Task_7 {
    public static void main(String[] args){
        System.out.println(longestNonrepeatingSubstring("abcabcbb"));
        System.out.println(longestNonrepeatingSubstring("aaaaaa"));
        System.out.println(longestNonrepeatingSubstring("abcde"));
        System.out.println(longestNonrepeatingSubstring("abcda"));
    }
    public static String longestNonrepeatingSubstring(String str){
        String podstr = "";
        char[] mass = str.toCharArray();
        StringBuilder strBuilder = new StringBuilder();
        for (char c : mass) {
            if (!strBuilder.toString().contains(String.valueOf(c)))
                strBuilder.append(c);
            else {
                if (strBuilder.length() > podstr.length())
                    podstr = strBuilder.toString();
                strBuilder = new StringBuilder("" + c);
            }
        }
        str = strBuilder.toString();
        if (str.length() > podstr.length())
            podstr = str;
        return podstr;
    }
}
