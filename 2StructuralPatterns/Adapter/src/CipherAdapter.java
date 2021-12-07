/**
 * @author ChenWeihan
 * @create 2021-11-28 15:59
 */
public class CipherAdapter extends DataOperation{
    private Caesar cipher;
    public CipherAdapter() {
        cipher = new Caesar();
    }

    @Override
    public String doEncrypt(int key, String ps) {
        return cipher.doEncrypt(key, ps);
    }
}
