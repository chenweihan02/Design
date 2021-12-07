import 敏感信息加密.DataEncryptAdapter;
import 敏感信息加密.DataOperation;

/**
 * @author ChenWeihan
 * @create 2021-12-05 15:17
 */
public class RentServer {
    private Account account = new User("0","vistor","","","");
    private int level = 0; // 0 游客， 1 用户， 2管理员
    private DataOperation dataDao = new DataEncryptAdapter();
    public void login(Account account, int level) {
        // 对数据库中的数据解密对比
        dataDao.setData("数据库中的数据");
        String t = dataDao.getData();
        dataDao.doEncrypt(t);
        //通过user 与数据库中查询判断是否登录》
        this.account = account;
        this.level = level;

    }

    public void register(Account account) {
        dataDao.setData(account.getIdCardNo());
        String t = dataDao.getData();
        dataDao.doEncrypt(t);
        // 注册用户。
    }

    //在这里完成一系列操作，
    public void rentCar()  {
        if (level == 1) {
            User user = (User) account;
            user.rentCar();
        } else {
            System.out.println("无权限");
        }

        //判断用户类型
    }

    public void completeRentCar(Order order) {
        if (level == 1) {
            User user = (User) account;
            user.completeRentCar(order);
        } else {
            System.out.println("无权限");
        }
        User user = (User) account;
    }

    // 添加车辆。
    public void addCar(Car car) {
        if (level == 2) {
            Manager manager = (Manager) account;
            manager.addCar(car);
        } else {
            System.out.println("无权限");
        }
    }

    // 销售总额
    public void  totalSales() {
        if (level == 2) {
            Manager manager = (Manager) account;
            manager.totalSales();
        } else {
            System.out.println("无权限");
        }
        // 根据数据库中查询销售总额。
    }

}
