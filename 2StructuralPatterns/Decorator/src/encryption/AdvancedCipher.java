package encryption;

/**
 * @author ChenWeihan
 * @create 2021-12-01 18:28
 */
public class AdvancedCipher extends CipherDecorator{
    public AdvancedCipher(Cipher cipher) {
        super(cipher);
    }

    @Override
    public String encrypt(String plainText) {
        String result = super.encrypt(plainText);
        result = mod(result);
        return result;
    }

    public String mod(String text) {
        String str = "";
        for (int i = 0; i < text.length(); i ++ ) {
            String c = String.valueOf(text.charAt(i) % 6);
            str += c;
        }
        return str;
    }
}
