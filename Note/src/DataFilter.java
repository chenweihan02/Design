/**
 * @author ChenWeihan
 * @create 2021-12-04 21:07
 */
public final class DataFilter {
    public String doDataFilter(String data){
        String[] dict= {"日", "TMD", "毒品", "台独"};
        for (String w : dict) {
            data.replaceAll("w", "*");
        }
        return data;
    }
}
