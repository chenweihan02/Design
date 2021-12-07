/**
 * @author ChenWeihan
 * @create 2021-12-03 20:18
 */
public class DiamondMember extends Member{

    public DiamondMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("钻石💎会员发送信息: ");
        chatroom.sendText(name, to, message); // 发送文本
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("钻石💎会员发送图片: ");
        chatroom.sendImage(name, to, image); // 发送图片
    }
}
