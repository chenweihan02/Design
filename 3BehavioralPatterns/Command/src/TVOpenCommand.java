/**
 * @author ChenWeihan
 * @create 2021-12-01 20:41
 */
public class TVOpenCommand implements AbstractCommand{

    private Television tv;
    public TVOpenCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.open();
    }
}
