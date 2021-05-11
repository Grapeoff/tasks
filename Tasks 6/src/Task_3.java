public class Task_3 {
    public static void main(String[] args) {
        System.out.println(validColor("rgb(0,0,0)"));
        System.out.println(validColor("rgb(0,,0)"));
        System.out.println(validColor("rgb(255,256,255)"));
        System.out.println(validColor("rgba(0,0,0,0.123456789)"));
    }

    static boolean validColor(String rgb) {
        String skobky = rgb.substring(rgb.indexOf('(') + 1, rgb.indexOf(')'));
        String[] num = skobky.split(",");
        int number = num.length == 4 ? 1 : 0;

        for (int i = 0; i < num.length - number; i++) {
            try {
                Integer value = Integer.valueOf(num[i]);
                if (value < 0 || value > 255)
                    return false;
            }
            catch (Exception exp) {
                return false;
            }
        }
        if (number == 1) {
            try {
                Double value = Double.valueOf(num[3]);
                if (value < 0 || value > 1)
                    return false;
            }
            catch (Exception exp) {
                return false;
            }
        }
        return true;
    }
}
