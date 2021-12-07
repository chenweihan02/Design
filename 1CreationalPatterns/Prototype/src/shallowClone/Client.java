package shallowClone;

/**
 * @author ChenWeihan
 * @create 2021-11-28 15:01
 */
public class Client {
    public static void main(String[] args) {
        Email email, copyEmail;
        email = new Email();

        copyEmail = (Email) email.clone();

        System.out.println("email == copyEmail?");
        System.out.println(email == copyEmail);

        System.out.println("email.getAttachment == copyEmail.getAttachment?");
        System.out.println(email.getAttachment() == copyEmail.getAttachment());
    }
}
