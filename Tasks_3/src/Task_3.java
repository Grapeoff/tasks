public class Task_3 {
    public static void main(String[] args) {
        System.out.println(checkPerfect(6));
        System.out.println(checkPerfect(28));
        System.out.println(checkPerfect(496));
        System.out.println(checkPerfect(12));
        System.out.println(checkPerfect(97));
    }

    //Функция возращает кол-во решений в зависимости от квадртаного уравнения.
    public static boolean checkPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++)
            if (number % i == 0)
                sum += i;
        return sum == number;
    }
}
