public class CheckPasswordAndLogin {

    public static void checkLoginPassword(String login, String password, String confirmPassword) {

        if (login.length() > 20 || checkString(login)) {
            throw new WrongLoginException("Логин слишком длинный, или содержит недопустимые символы");
        }

        if (password.length() > 20 || checkString(password) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль слишком длинный, или содержит недопустимые символы, " +
                    "или не подтвержден");
        }
    }
        private static boolean checkString (String password) {
            for (int i = 0; i < password.length(); i++) {
                var c = Character.toLowerCase(password.charAt(i));
                if ((c < 'a' || c > 'z') && (c < '0' || c > '9') && (c != '_')) {
                    return true;
                }
            }
            return false;

        }
    }
