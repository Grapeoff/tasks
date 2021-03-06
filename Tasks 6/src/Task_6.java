public class Task_6 {
    public static void main(String[] args){
        System.out.println(ulam(4));
        System.out.println(ulam(9));
        System.out.println(ulam(206));
    }
    public static int ulam (int n){
        int[] mas = new int[n];
        mas[0]=1;
        mas[1]=2;
        int len=2, next=3;
        while (next<Integer.MAX_VALUE && len<n){
            int count =0;
            for (int i=0;i<len;i++){
                for (int j=len-1; j>i; j--){
                    if (mas[i]+mas[j]==next && mas[i]!=mas[j])
                        count++;
                    else if (count > 1)
                        break;
                }
                if (count > 1)
                    break;
            }
            if (count == 1) {
                mas[len]=next;
                len++;
            }
            next++;
        }
        return mas[n-1];
    }
}
