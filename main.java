import java.util.Scanner;

public class main {e
    public static void main(String[] args) {
        int count=0;
        Scanner scanner = new Scanner(System.in);
        String str = "Asajdhssjkdhsadhjgjhgfsdhdfglkdsjkfh";
        System.out.println("Enter character need search: ");
        char input = scanner.next().charAt(0);
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==input)
                count++;
        }

        System.out.println("That character appear  is --" +count+" time(s).");
    }
}
