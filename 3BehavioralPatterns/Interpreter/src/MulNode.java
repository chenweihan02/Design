/**
 * @author ChenWeihan
 * @create 2021-12-04 10:23
 */
public class MulNode extends SymbolNode{

    public MulNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return super.left.interpret() * super.right.interpret();
    }
}
