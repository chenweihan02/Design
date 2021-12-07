/**
 * @author ChenWeihan
 * @create 2021-12-03 21:09
 */
public class Client {
    public static void main(String[] args) {
        ForumAccount account = new ForumAccount("张三");
        account.writeNote(20);
        System.out.println("---------------------------------------------");
        account.downloadFile(20);
        System.out.println("---------------------------------------------");
        account.replyNote(1000);
        System.out.println("---------------------------------------------");
        account.downloadFile(10);
    }
}
