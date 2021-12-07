package encryption;

/**
 * @author ChenWeihan
 * @create 2021-12-01 18:25
 */
public class CipherDecorator implements Cipher{
    private Cipher cipher;

    public CipherDecorator (Cipher cipher) {
        this.cipher = cipher;
    }

    @Override
    public String encrypt(String plainText) {
        return cipher.encrypt(plainText);
    }
}
