package strings;

public class TextProcessor {
    public static void main(String[] args) {
        reverseString("Hello World");
        addSpaces("HelloWorld!It'sMeAngie");
    }

    public static void reverseString(String text) {
        for (int i=text.length()-1; i>=0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    public static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);
        for (int i = 1; i < modifiedText.length(); i++) {
            if(Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
