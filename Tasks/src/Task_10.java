public class Task_10 {
    public static void main(String[] args) {
        System.out.println(abcmath(42, 5, 10));
        System.out.println(abcmath(5, 2, 1));
        System.out.println(abcmath(1, 2, 3));
    }

    //Функция возвращает true - если a добавленное к себе b раз делится на c, иначе false
    public static boolean abcmath(int a, int b, int c) {
        int sum = a;
        for (int i = 0; i < b; i++)
            sum += sum;
        if (sum % c == 0)
            return true;
        return false;
    }
}