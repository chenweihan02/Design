/**
 * @author ChenWeihan
 * @create 2021-12-01 20:46
 */
public class Client {
    public static void main(String[] args) {
        AbstractCommand openCommand, closeCommand, changeCommand;

        openCommand = new TVOpenCommand();
        closeCommand = new TVCloseCommand();
        changeCommand = new TVChangeCommand();
        Controller controller = new Controller(openCommand, closeCommand, changeCommand);
        controller.open();
        controller.change();
        controller.close();
    }
}
