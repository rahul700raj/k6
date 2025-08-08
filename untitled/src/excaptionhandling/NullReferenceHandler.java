public class NullReferenceHandler {
    public static void main(String[] args) {
        String s = null;

        try {
            int len = s.length();  // This will throw NullPointerException
            System.out.println("Length of string: " + len);
        } catch (NullPointerException e) {
            System.out.println("String is null, cannot get length.");
        }
    }
}

