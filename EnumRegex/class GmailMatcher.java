class GmailMatcher {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
        matcher m = p.matcher("pintu@gmail.com");
        if (m.find()) {
            System.out.println("Correct - !");
        } else {
            System.err.println("Wrong Input ....");
        }
    }
}