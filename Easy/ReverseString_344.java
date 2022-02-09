package Easy;

public class ReverseString_344 {
    public static void main(String[] args) {
        char[]s = {'h','e','l','l','o'};
        reverseString(s);
        for(int i = 0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }

    public static void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            s = swap(s,i, s.length-1-i);
        }
    }

    private static char[] swap(char[]arr,int a,int b){
        char temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}
