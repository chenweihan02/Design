package deepClone;

import deepClone.Email;

/**
 * @author ChenWeihan
 * @create 2021-11-28 15:01
 */
public class Client {
    public static void main(String[] args) {
        deepClone.Email email, copyEmail = null;
        email = new Email();

        try {
            copyEmail = (Email) email.deepClone();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("email == copyEmail?");
        System.out.println(email == copyEmail);

        System.out.println("email.getAttachment == copyEmail.getAttachment?");
        System.out.println(email.getAttachment() == copyEmail.getAttachment());
    }
}
