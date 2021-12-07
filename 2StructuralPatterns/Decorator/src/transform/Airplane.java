package transform;

/**
 * @author ChenWeihan
 * @create 2021-12-01 18:12
 */
public class Airplane extends Changer{
    public Airplane(Transform transform) {
        super(transform);
        System.out.println("变成飞机!");
    }

    public void fly() {
        System.out.println("在天空飞翔！");
    }
}
