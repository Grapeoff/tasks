public class Task_10 {
    public static void main(String[] args) {
        System.out.println(palindromedescendant(11211230));
        System.out.println(palindromedescendant(13001120));
        System.out.println(palindromedescendant(23336014));
        System.out.println(palindromedescendant(11));
    }

    public static boolean palindromedescendant(int num){
        boolean bul = false;
        StringBuffer nuum =new StringBuffer(num);
        StringBuffer nuuum =new StringBuffer(num);
        if (nuum.length()%2!=0)
            return false;
        else{
            while (!bul){
                if(nuum != nuum.reverse()){
                    for(int i=0; i<nuum.length();i+=2){
                        int a = Integer.parseInt(String.valueOf(nuum.charAt(i)));
                        int b = Integer.parseInt(String.valueOf(nuum.charAt(i+1)));
                        nuuum.append(a+b);
                    }
                }
                else
                    bul = true;
            }
        }
        return bul;
    }
}
