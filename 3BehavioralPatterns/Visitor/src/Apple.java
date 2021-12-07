/**
 * @author ChenWeihan
 * @create 2021-12-04 10:39
 */
public class Apple implements Product{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
