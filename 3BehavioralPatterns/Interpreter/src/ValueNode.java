/**
 * @author ChenWeihan
 * @create 2021-12-04 10:21
 */
public class ValueNode implements Node{

    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
