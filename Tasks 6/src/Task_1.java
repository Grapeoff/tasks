public class Task_1 {
    public static void main(String args[]) {
        System.out.println(bell(1));    //1
        System.out.println(bell(2));    //2
        System.out.println(bell(3));    //5
    }

    static int bell(int num) {
        if (num <= 1)
            return 1;
        int[] mas1 = new int[num];
        int[] mas2 = new int[num];
        mas1[0] = 1;

        for (int i = 0; i < num - 1; i++) {
            mas2[0] = mas1[i];
            for (int j = 1; j <= i + 1; j++)
                mas2[j] = mas1[j - 1] + mas2[j - 1];
            for (int j = 0; j <= i + 1; j++)
                mas1[j] = mas2[j];
        }

        return mas2[num - 1];
    }
}
