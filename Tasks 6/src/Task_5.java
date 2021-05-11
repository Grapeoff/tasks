import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        getHashTags("How the Avocado Became the Fruit of the Global Trade");
        getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year");
        getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit");
        getHashTags("Visualizing Science");
//        System.out.println(getHashTags("How the Avocado Became the Fruit of the Global Trade"));
//        System.out.println(getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year"));
//        System.out.println(getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit"));
//        System.out.println(getHashTags("Visualizing Science"));
    }

    static void getHashTags(String str) {
        System.out.println(str);
        String[] strs = str.split(" ");
        Arrays.sort(strs, (a, b)->Integer.compare(b.length(), a.length()));
        int l = Math.min(strs.length, 3);
        String[] res = new String[l];
        for(int i = 0; i < l; i++) {
            if(strs[i].endsWith(","))
                res[i] = "#"+strs[i].toLowerCase().substring(0, strs[i].length()-1).trim();
            else
                res[i] = "#"+strs[i].toLowerCase().trim();
        }
        for (int i = 0; i < 3; i++)
            System.out.println(res[i]);
    }
}
