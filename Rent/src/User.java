/**
 * @author ChenWeihan
 * @create 2021-12-05 13:43
 */
public class User extends Account{
    private AbstractState state; // 用户的当前等级 头衔
    private double deposit;

    public double getDeposit() { return deposit; }

    public void setDeposit(double deposit) { this.deposit = deposit;}

    public User(String userId, String username, String password, String telNo, String idCardNo) {
        super(userId, username, password, telNo, idCardNo);
        this.state = new PrimaryState(this);
        System.out.println("注册成功");
    }

    //借车
    public void rentCar() {
        // 先判断是否有押金。
        if (this.deposit < 1000) {
            // 先交押金。
        }
        //通过选择car, 获取对应ID, 然后创建订单.
        new Order();
        //支付价格。 pay()

    }

    //完成租车
    public void completeRentCar(Order order) {
        state.completeRentCar(order);
    }


    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }
}
