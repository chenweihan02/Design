package 加密;

/**
 * @author ChenWeihan
 * @create 2021-12-05 9:45
 */
public class EncryptDecorator implements EntryptMD5{

    private EntryptMD5 entryptMD5;

    public EncryptDecorator(EntryptMD5 entryptMD5) {
        this.entryptMD5 = entryptMD5;
    }

    @Override
    public String encrypt(String Origin) {
        return entryptMD5.encrypt(Origin);
    }
}
