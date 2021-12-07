package 加密;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * @author ChenWeihan
 * @create 2021-12-04 20:56
 */
public class SimpleEncryptMD5 implements EntryptMD5 {
    @Override
    public String encrypt(String Origin) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(Origin.getBytes());
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
