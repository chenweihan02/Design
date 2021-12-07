
/**
 * @author ChenWeihan
 * @create 2021-12-03 20:04
*/public abstract class AbstractChatroom {
    public abstract void register(Member member);
    public abstract void sendText(String from, String to, String message);
    public abstract void sendImage(String from, String to, String image);
}
