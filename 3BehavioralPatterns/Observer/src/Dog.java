/**
 * @author ChenWeihan
 * @create 2021-12-03 21:00
 */
public class Dog implements MyObserver{
    @Override
    public void response() {
        System.out.println("狗跟着叫!");
    }
}
