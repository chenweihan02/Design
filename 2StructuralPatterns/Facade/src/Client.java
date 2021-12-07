/**
 * @author ChenWeihan
 * @create 2021-12-01 18:52
 */
public class Client {
    public static void main(String[] args) {
        GeneralSwitchFacade generalSwitchFacade = new GeneralSwitchFacade();
        generalSwitchFacade.on();
        System.out.println("=-----------------");
        generalSwitchFacade.off();
    }
}
