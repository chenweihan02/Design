import java.util.ArrayList;

/**
 * @author ChenWeihan
 * @create 2021-12-01 18:05
 */
public class Plate extends MyElement{

    private ArrayList list = new ArrayList();

    public void add(MyElement element) {
        list.add(element);
    }

    public void remove(MyElement element) {
        list.remove(element);
    }

    @Override
    public void eat() {
        for (Object obj : list) {
            ((MyElement) obj).eat();
        }
    }
}
