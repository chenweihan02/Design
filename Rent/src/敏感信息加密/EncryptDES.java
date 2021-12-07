package 敏感信息加密;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.*;
import java.security.*;

/**
 * @author ChenWeihan
 * @create 2021-12-05 21:57
 */
public final class EncryptDES {
    private static Key key;

    private static String KEY_STR="myKey";
    private static String CHARSETNAME="UTF-8";
    private static String ALGORITHM="DES";

    static {
        try {
            //生成DES算法对象
            KeyGenerator generator = KeyGenerator.getInstance(ALGORITHM);
            //运用SHA1安全策略
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            //设置上密钥种子
            secureRandom.setSeed(KEY_STR.getBytes());
            //初始化基于SHA1的算法对象
            generator.init(secureRandom);
            //生成密钥对象
            key=generator.generateKey();
            generator=null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /***
     * 获取加密的信息
     * @param str
     * @return
     */
    public String encryptData(String str) {
        //基于BASE64编码，接收byte[]并转换成String
        BASE64Encoder encoder = new BASE64Encoder();
        try {
            //按utf8编码
            byte[] bytes = str.getBytes(CHARSETNAME);
            //获取加密对象
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            //初始化密码信息
            cipher.init(Cipher.ENCRYPT_MODE, key);
            //加密
            byte[] doFinal = cipher.doFinal(bytes);
            //byte[]to encode好的String 并返回
            return encoder.encode(doFinal);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /***
     * 获取解密之后的信息
     * @param str
     * @return
     */
    public String decryptData(String str) {
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            //将字符串decode成byte[]
            byte[] bytes = decoder.decodeBuffer(str);
            //获取解密对象
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            //初始化解密信息
            cipher.init(Cipher.DECRYPT_MODE, key);
            //解密
            byte[] doFial = cipher.doFinal(bytes);

            return new String(doFial, CHARSETNAME);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
