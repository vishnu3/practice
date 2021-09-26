package smartnews;

import java.util.Scanner;


/*
 * Create the Encrypter class here.
 */
class Encrypter {

    public static String getEncryptedName(String name) {
        boolean isValid = Validator.validate(name);

        if (isValid) {
            return new StringBuilder(name)
                    .reverse()
                    .toString().toLowerCase();
        } else {
            throw new IllegalArgumentException("Try again with valid name");
        }

    }
}


class Validator {
    public static boolean validate(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
                return false;
            }
        }

        return true;
    }
}

public class Solution2 {
    private static final Scanner INPUT_READER = new Scanner(System.in);

    public static void main(String[] args) {
        String name = INPUT_READER.nextLine();

        try {
            System.out.println(Encrypter.getEncryptedName(name));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
