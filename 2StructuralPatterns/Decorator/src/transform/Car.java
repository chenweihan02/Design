package transform;

/**
 * @author ChenWeihan
 * @create 2021-12-01 18:10
 */
public final class Car implements Transform{

    public Car() {
        System.out.println("变形金刚是一辆车");
    }

    @Override
    public void move() {
        System.out.println("在陆地上移动");
    }
}
