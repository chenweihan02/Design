/**
 * @author ChenWeihan
 * @create 2021-12-01 20:43
 */
public class TVCloseCommand implements AbstractCommand{

    private Television tv;

    public TVCloseCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.close();
    }
}
