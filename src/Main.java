public class Main {

    public static void main(String[] args) {

try {
    CheckPasswordAndLogin.checkLoginPassword("Vsz_1234", "123_9871", "123_987");
    System.out.println("Все отлично!");
} catch (WrongLoginException e){
    System.err.println("Error!" + e.getMessage());
    }
catch (WrongPasswordException e) {
    System.err.println("Error!" + e.getMessage());
}
finally {
    System.out.println("Работа закончена");
}
    }
}





