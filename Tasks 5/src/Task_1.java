public class Task_1 {
    public static void main(String[] args) {
        printArray(encrypt("Hello"));
        System.out.println(decrypt(new int[] { 72, 33, -73, 84, -12, -3, 13, -13, -68 }));
        printArray(encrypt("Sunshine"));
    }

    static int[] encrypt(String text) {
        if (text == "")
            return null;
        int[] num = new int[text.length()];
        num[0] = (int) text.charAt(0);
        for (int i = 1; i < text.length(); i++)
            num[i] = (int) text.charAt(i) - (int) text.charAt(i - 1);
        return num;
    }

    static void printArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    static String decrypt(int[] arrayNum) {
        char[] text = new char[arrayNum.length];
        int x = 0;
        for (int i = 0; i < arrayNum.length; x += arrayNum[i], i++)
            text[i] = (char) (arrayNum[i] + x);

        return new String(text);
    }
}
