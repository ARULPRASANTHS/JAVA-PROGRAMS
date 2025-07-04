public class Switch {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");

        
        if (s1 == s2) {
            System.out.println("s1 == s2: Same object");
        }

        if (s1.equals(s2)) {
            System.out.println("s1.equals(s2): Same content");
        } else {
            System.out.println("s1.equals(s2): Different content");
        }

        String result = s1.equals(s2) ? "match" : "no match";
        
   
        switch (result) {
            case "match":
                System.out.println("Switch: Strings match");
                break;
            case "no match":
                System.out.println("Switch: Strings do not match");
                break;
            default:
                System.out.println("Switch: Unknown result");
                break;
        }
    }
}