package Easy;

public class DefangIPaddr_1108 {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
