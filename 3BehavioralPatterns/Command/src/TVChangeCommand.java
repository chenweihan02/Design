/**
 * @author ChenWeihan
 * @create 2021-12-01 20:44
 */
public class TVChangeCommand implements AbstractCommand{

    private Television tv;

    public TVChangeCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
