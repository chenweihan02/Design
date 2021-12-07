/**
 * @author ChenWeihan
 * @create 2021-11-28 16:02
 */
public class Client {
    public static void main(String[] args) {
        DataOperation dao = (DataOperation) XMLUtil.getBean();
        dao.setPassword("abczABCZ");
        String ps = dao.getPassword();
        String es = dao.doEncrypt(2, ps);
        System.out.println("明文为: " + ps);
        System.out.println("密文为: " + es);
    }
}
