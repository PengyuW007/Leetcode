package Easy;

public class RestoreString_1528 {
    public static void main(String[] args) {
        int indices[]={4,5,6,7,0,2,1,3};
        System.out.println(restoreString1("codeleet",indices));
    }
    public static String restoreString1(String s, int[] indices){
        int len = indices.length;
        char[] temp = new char[len];

        for(int i = 0;i<len;i++){
            temp[indices[i]]=s.charAt(i);
        }

        return new String(temp);
    }

    public static String restoreString2(String s, int[] indices) {
        char[]chars = s.toCharArray();
        int len = indices.length;
        char[] temp = new char[len];

        for(int i = 0;i<len;i++){
            temp[indices[i]]=chars[i];
        }

        return new String(temp);
    }
}
