public class Task_9 {
    public static void main(String[] args) {
        System.out.println(formula("6 * 4 = 24"));
        System.out.println(formula("18 / 17 = 2"));
        System.out.println(formula("16 * 10 = 160 = 14 + 120"));
    }
    public static boolean formula(String formula){
        String[] mass = formula.split(" ");
        int ans = 0;
        int expectedResult = 0;
        if (!Character.isDigit(mass[0].charAt(0))) return false;
        else ans = Integer.parseInt(mass[0]);
        int i = 1;
        while (!mass[i].equals("=")) {
            if (mass[i].equals("+")){
                ans += Integer.parseInt(mass[i + 1]);
            }
            if (mass[i].equals("-")){
                ans -= Integer.parseInt(mass[i + 1]);
            }
            if (mass[i].equals("*")){
                ans *= Integer.parseInt(mass[i + 1]);
            }
            if (mass[i].equals("/")){
                ans /= Integer.parseInt(mass[i + 1]);
            }
            i += 2;
        }
        i = formula.indexOf('=');
        String check = formula.substring(i + 1, formula.length());
        if (check.contains("=")) return false;
        else expectedResult = Integer.parseInt(mass[mass.length - 1]);
        return ans == expectedResult;
    }
}
