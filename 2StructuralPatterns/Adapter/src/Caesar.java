/**
 * @author ChenWeihan
 * @create 2021-11-28 15:54
 */
public final class Caesar {
    public String doEncrypt(int key, String ps) {
        String es = "";
//        for (int i = 0; i < ps.length(); i ++ ) {
//            char c = ps.charAt(i);
//
//            if (c >= 'a' && c <= 'z') {
//                c += key % 26;
//                if (c > 'z') c -= 26;
//                if (c < 'a') c += 26;
//            }
//            if (c >= 'A' && c <= 'Z') {
//                c += key % 26;
//                if (c > 'Z') c -= 26;
//                if (c < 'A') c += 26;
//            }
//
//            es += c;
//        }
        for (int i = 0; i < ps.length(); i++ ) {
            String c = String.valueOf(ps.charAt(i) % key);
            es += c;
        }
        return es;
    }
}
