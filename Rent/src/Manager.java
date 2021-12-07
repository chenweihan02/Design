
/**
 * @author ChenWeihan
 * @create 2021-12-05 13:43
 */
public class Manager extends Account{
    public Manager(String userId, String username, String password, String telNo, String idCardNo) {
        super(userId, username, password, telNo, idCardNo);
    }

    // 添加车辆。
    public void addCar(Car car) {

    }

    // 销售总额
    public void  totalSales() {
       // 根据数据库中查询销售总额。
    }
}
