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
        System.out.println("ι»η³πδΌεειδΏ‘ζ―: ");
        chatroom.sendText(name, to, message); // ειζζ¬
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("ι»η³πδΌεειεΎη: ");
        chatroom.sendImage(name, to, image); // ειεΎη
    }
}
