public class Task_2 {
    public static void main(String[] args) {
        System.out.println(translateWord("flag"));
        System.out.println(translateWord("Apple"));
        System.out.println(translateWord("button"));
        System.out.println(translateWord(""));
        System.out.println(translateWord(translateSentence("I like to eat honey waffles.")));
        System.out.println(translateWord(translateSentence("Do you think it is going to rain today?")));
    }
    static String translateWord(String st){
        char[] str=st.toCharArray();
        String otv="";
        if(st.equals(""))return "";
        String uu="eyuioaEUOAI";
        if(uu.contains(String.valueOf(str[0]))) otv+=st + "yay";
        else for(int i=0;i<str.length-1;i++)
            if(uu.contains(String.valueOf(str[i+1]))){ otv+=st.substring(i+1) + st.substring(0,i+1) + "ay";break;}
        str=otv.toCharArray();
        for(int i=0;i<str.length;i++) if(str[i]==',' || str[i]=='.'){
            char a=str[i];
            if (str.length - (i + 1) >= 0) System.arraycopy(str, i + 1, str, i + 1 - 1, str.length - (i + 1));
            str[str.length-1]=a;
            otv=new String(str);
        }
        return otv;
    }
    static String translateSentence(String text){
        String[] wow = text.split(" ");
        StringBuilder otvet= new StringBuilder();
        for(int i = wow.length - 1; i >= 0; i--)
            otvet.append(translateWord(wow[i])).append(" ");
        return otvet.toString();
    }
}
