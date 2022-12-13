import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laboratorywork2 {
    public static void main(String args[]) {
        String pattern = "^(?=\\w*\\d)(?=\\w*[a-z])(?=\\w*[A-Z]).{8,}$";
        System.out.print("Ввелите пароль: ");
        Scanner s = new Scanner(System.in);
        String expression = s.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(expression);
        while (true) {
            if (m.matches()) {
                System.out.println("Пароль надежен");
                break;
            } else {
                System.out.println("Пароль ненадежен. Повторите ввод");
                expression = s.nextLine();
                m = p.matcher(expression);
            }
        }
        s.close();
    }
}
