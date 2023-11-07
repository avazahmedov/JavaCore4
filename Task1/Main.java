package Task1;

public class Main {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        boolean res= Task1.check("avaz", "ahmedov", "ahmedov");
        //boolean res1 = Task1.check("avaz", "ahmedov1", "ahmedov");
        boolean res2 = Task1.check("avavavavaavavavavavavavavaz", "ahmedov", "ahmedov");
        System.out.println(res2);
    }

}
