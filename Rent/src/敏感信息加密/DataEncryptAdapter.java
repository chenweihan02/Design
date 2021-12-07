package 敏感信息加密;

import 加密.EntryptMD5;

/**
 * @author ChenWeihan
 * @create 2021-12-05 22:22
 */
public class DataEncryptAdapter extends DataOperation{

    private EncryptDES encryptDES;

    public DataEncryptAdapter() {
        encryptDES = new EncryptDES();
    }

    @Override
    public String doEncrypt(String data) {
        return encryptDES.encryptData(data);
    }

    @Override
    public String deEncrypt(String data) {
        return encryptDES.decryptData(data);
    }
}
