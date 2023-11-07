package Task1;

public class Task1 {
    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    private String password;
    private String confirmPassword;

    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20){
            throw new WrongLoginException("login не соответствует требованиям");
        }
        else if(!password.equals(confirmPassword) || password.length() > 20){
            throw new WrongPasswordException("password не соответствует требованиям");
        }
        else return true;
    }


}
