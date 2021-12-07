import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Date;

/**
 * @author ChenWeihan
 * @create 2021-12-05 13:38
 */
public abstract class AbstractState {
    protected User user;
    protected int point; // 积分，消费总金额! ￥1=1 score
    protected String stateName; // 状态名

    public abstract void checkState(int score);

    //判单当前订单是否超时
    public boolean onTime(Order order) {
        String h = order.getRentTime();
        Date startTime = order.getCreateTime();
        return true;
    }

    // 租车归还后
    public void completeRentCar(Order order) {
        // 超时的话, 不提供积分加分服务
        if (onTime(order))
        {
            this.point += order.getPrice();
            checkState(point);
        }

        //通过传入订单来完成租车，
        String carId = order.getCarId();//
        //根据carId来获取车辆信息, 设置车辆状态为空闲。
        new Car("demo", "demo", CarState.CAR_TYPE_FREE, "good", 200);

        System.out.println(user.getUsername() + "租车 花费" + order.getPrice() + " 当前总积分" + this.point + " 当前状态" + stateName);
    }


    public int getPoint() {
        return (this.point);
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getStateName() {
        return (this.stateName);
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
