import java.math.BigDecimal;

/**
 * @author ChenWeihan
 * @create 2021-12-05 13:26
 */
public class Car {
    private String carId; // 车id
    private String model; // 汽车型号
    private String state; // 汽车当前状态, 空闲 忙碌
    private String detail; // 汽车详细内容
    private double price; // 价格

    public Car(String carId, String model, String state, String detail, double price) {
        this.carId = carId;
        this.model = model;
        this.state = state;
        this.detail = detail;
        this.price = price;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
