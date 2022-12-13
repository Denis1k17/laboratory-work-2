import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laboratorywork1 {
    public static void main(String args[]) {
        String pattern_0 = "((?:0[1-9]|[12][0-9]|3[01]).(?:0?[1-9]|1[0-2]).(?:19[0-9][0-9]|[0-9][0-9][0-9][0-9]))";
        String pattern_1 = "((?:0[1-9]|[12][0-9]|3[01])/(?:0?[1-9]|1[0-2])/(?:19[0-9][0-9]|[0-9][0-9][0-9][0-9]))";
        System.out.print("Введите дату в формате dd/mm/yyyy: ");
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        Pattern e_0 = Pattern.compile(pattern_1);
        Pattern e_1 = Pattern.compile(pattern_0);
        Matcher l = e_0.matcher(expression);
        Matcher l_1 = e_1.matcher(expression);
        if (l.matches()) {
            System.out.print("Введенное выражение является датой");
        }
        else  if(l_1.matches())
        {
            System.out.print("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
        }
        else
        {
            System.out.print("Введенное выражение не является датой");
        }
        sc.close();
    }
}
