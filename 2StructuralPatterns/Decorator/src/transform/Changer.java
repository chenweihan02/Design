package transform;

/**
 * @author ChenWeihan
 * @create 2021-12-01 18:11
 */
public class Changer implements Transform{

    private Transform transform;

    public Changer(Transform transform) {
        this.transform = transform;
    }

    @Override
    public void move() {
        transform.move();
    }
}
