/**
 * @author ChenWeihan
 * @create 2021-11-28 13:47
 */
public class Client {
    public static void main(String[] args) {
        try {
            TV tv;
            TVFactory tvFactory;
            tvFactory = (TVFactory) XMLUtil.getBean();
            tv = tvFactory.produceTV();
            tv.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

