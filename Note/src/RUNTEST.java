import java.security.MessageDigest;

/**
 * @author ChenWeihan
 * @create 2021-12-04 16:16
 */
public class RUNTEST {

    public static void main(String[] args)throws Exception {
        String s = "";
        byte[] arr = s.getBytes();
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(arr);
        System.out.println(md5.digest());
    }

}
