/**
 * @author ChenWeihan
 * @create 2021-11-28 13:21
 */
public class Client {
    public static void main(String[] args) {
        try {
            TV tv; // 抽象类型定义
            String brandName = XMLUtilTV.getBrandName();
            tv = TVFactory.produceTV(brandName);
            tv.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
