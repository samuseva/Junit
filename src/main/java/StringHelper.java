import java.util.Random;

public class StringHelper {

    String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public String generate(int stringLength) {
        StringBuilder sb = new StringBuilder(stringLength);
        Random random = new Random();
        for (int i = stringLength; i > 0; i--)
            sb.append(alphanumeric.charAt(random.nextInt(62)));
        return sb.toString();
    }

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public String format(String[] args) {
        for (int i = args.length - 1; i > 0; i--) {
            String regex = "{" + i + "}";
            args[0] = args[0].replace(regex, args[i]);
        }
        return args[0];
    }

    public String camelCase(String strInput) {
        char[] ch = strInput.toCharArray();
        int len = ch.length - 1;
        ch[len] = Character.toUpperCase(ch[len]);
        for (int i = 0; i < len; i += 2) {
            ch[i] = Character.toUpperCase(ch[i]);
            ch[i + 1] = Character.toLowerCase(ch[i + 1]);
        }
        return String.valueOf(ch);
    }
}