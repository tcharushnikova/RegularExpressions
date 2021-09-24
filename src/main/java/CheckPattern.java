import java.util.regex.Pattern;

public class CheckPattern {
    //регулярное выражение, определяющее является ли заданная строка IP адресом, записанным в десятичном виде
    public static boolean isIP(String input) {
        Pattern pattern = Pattern.compile("((25[0-5]|" + //250-255
                "2[0-4][0-9]|" + //200-249
                "1[0-9][0-9]|" + //100-199
                "[1-9][0-9]|" + //19-99
                "[0-9])" + //0-9
                "\\.){3}" +
                "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9])");
        return pattern.matcher(input).matches();
    }

    //регулярное выражение, определяющее является ли данная строка GUID с или без скобок
    public static boolean isGUID(String input) {
        Pattern pattern = Pattern.compile("[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}|[{][0-9a-fA-F]{8}-" +
                "([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}[}]");
        return pattern.matcher(input).matches();
    }

    //регулярное выражение, определяющее является ли данная строчка валидным URL адресом
    public static boolean isURL(String input) {
        Pattern pattern = Pattern.compile("(https?://)?" + //http(s)://
                            "(www\\.)?" + //www.
                            "(((?!-)[A-Za-z0-9-]{2,}(?<!-)\\.)+)([a-zA-Z]{2,6})" + //домен (поддомен)
                            "(:[0-9]{1,5})?" + //порт
                            "(/\\w+)*(\\.\\w+)?" + //папка или файл с расширением
                            "([?|&]\\w+=\\w*)*" + //GET запросы с передачей параметров
                            "(#\\w+)?"); //якорь
        return pattern.matcher(input).matches();
    }

    //регулярное выражение, определяющее надежно ли составлен пароль
    public static boolean isPassword(String input) {
        Pattern pattern = Pattern.compile("(?=.*[0-9])" + //по крайней мере одна цифра
                "(?=.*[a-z])" + //по крайней мере одна маленькая буква
                "(?=.*[A-Z])" + //по крайней мере одна заглавная буква
                "[a-zA-Z0-9_]{8,}");
        return pattern.matcher(input).matches();
    }
}