package transform;

/**
 * @author ChenWeihan
 * @create 2021-12-01 18:12
 */
public class Robot extends Changer{
    public Robot(Transform transform) {
        super(transform);
        System.out.println("变成机器人🤖");
    }

    public void say() {
        System.out.println("说话!");
    }
}
