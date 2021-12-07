/**
 * @author ChenWeihan
 * @create 2021-12-04 9:13
 */
public class Client {
    public static void main(String[] args) {
        BankTemplateMethod bank;
        bank = (BankTemplateMethod) XMLUtil.getBean();
        bank.process();
        System.out.println("--------------------");
    }
}
