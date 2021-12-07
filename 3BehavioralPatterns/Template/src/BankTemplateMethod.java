/**
 * @author ChenWeihan
 * @create 2021-12-04 9:06
 */
public abstract class BankTemplateMethod {
    public void takeNumber() {
        System.out.println("取号排队");
    }

    public abstract void transact();

    public void evaluate() {
        System.out.println("反馈评分");
    }

    public void process() {
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
