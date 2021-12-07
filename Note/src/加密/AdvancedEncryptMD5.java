package 加密;

/**
 * @author ChenWeihan
 * @create 2021-12-05 9:48
 */
public class AdvancedEncryptMD5 extends EncryptDecorator{

    public AdvancedEncryptMD5(EntryptMD5 entryptMD5) {
        super(entryptMD5);
    }

    @Override
    public String encrypt(String Origin) {
        String str = "";
        for (int i = 0; i < Origin.length(); i ++ ) {
            String c = String.valueOf(Origin.charAt(i) + 1);
            str += c;
        }
        return str;
    }

    public String decrypt(String Origin) {
        String str = "";
        for (int i = 0; i < Origin.length(); i ++ ) {
            String c = String.valueOf(Origin.charAt(i) - 1);
            str += c;
        }
        return str;
    }
}
