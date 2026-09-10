class SplitString {
    public static void main(String[] args) {
        String text = "Java,Python,C++";
        String[] languages = text.split(",");

        for (String language : languages) {
            System.out.println(language);
        }
    }
}
