/**
 * @author ChenWeihan
 * @create 2021-12-03 20:36
 */
public class Client {
    public static void main(String[] args) {

        UserInfoDTO user = new UserInfoDTO();
        Caretaker caretaker = new Caretaker(); // 创建负责人

        user.setAccount("张三");
        user.setPassword("123456");
        user.setTelNo("11111111111");
        System.out.println("状态一: ");
        user.show();
        caretaker.setMemento(user.saveMemento());
        System.out.println("----------------------");

        user.setPassword("111111");
        user.setTelNo("00000000000");
        System.out.println("状态二: ");
        user.show();
        System.out.println("----------------------");

        user.restoreMemento(caretaker.getMemento()); // 从备忘录中恢复
        System.out.println("回到状态一: ");
        user.show();
        System.out.println("----------------------");
    }
}
