public class Task_3 {
    public static void main(String[] args) {
        System.out.println(canComplate("butl", "beautiful"));
        System.out.println(canComplate("butlz", "beautiful"));
        System.out.println(canComplate("tulb", "beautiful"));
        System.out.println(canComplate("bbutl", "beautiful"));
    }

    static boolean canComplate(String a, String b) {
        int index = 0;
        for (int i = 0; i < b.length(); i++){
            if (a.charAt(index) == b.charAt(i))
                index++;
        }
        return index == a.length();
    }
}
