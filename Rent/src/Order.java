import java.util.Date;

/**
 * @author ChenWeihan
 * @create 2021-12-05 13:30
 */
public class Order{
    private String orderId; // 编号id
    private String carId; // 车的id
    private String address; // 地址
    private Date createTime; // 订单创建
    private String userId; // 下单的账号
    private double price; // 价格 车的租金和时间
    private String orderState; // 订单状态
    private String detail; // 订单详细
    private String rentTime; // 租借时长。
    private Date finishTime; // 订单最总完成时间。

    public Order() {
    }

    public Order(String orderId, String carId, String address, Date createTime, String userId, double price, String orderState, String detail, String rentTime, Date finishTime) {
        this.orderId = orderId;
        this.carId = carId;
        this.address = address;
        this.createTime = createTime;
        this.userId = userId;
        this.price = price;
        this.orderState = orderState;
        this.detail = detail;
        this.rentTime = rentTime;
        this.finishTime = finishTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getRentTime() {
        return rentTime;
    }

    public void setRentTime(String rentTime) {
        this.rentTime = rentTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

}
