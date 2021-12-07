/**
 * @author ChenWeihan
 * @create 2021-12-03 20:20
 */
public class Client {
    public static void main(String[] args) {
        AbstractChatroom happChat = new ChatGroup();

        Member member1 = new DiamondMember("张三");
        Member member2 = new DiamondMember("李四");
        Member member3 = new CommonMember("小明");
        Member member4 = new CommonMember("小强");
        Member member5 = new CommonMember("小飞");

        happChat.register(member1);
        happChat.register(member2);
        happChat.register(member3);
        happChat.register(member4);
        happChat.register(member5);

        member1.sendText("李四", "李四, 你好！");

    }
}
