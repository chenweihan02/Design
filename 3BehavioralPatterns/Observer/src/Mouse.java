/**
 * @author ChenWeihan
 * @create 2021-12-03 21:00
 */
public class Mouse implements MyObserver{
    @Override
    public void response() {
        System.out.println("老鼠在努力的逃跑!");
    }
}
