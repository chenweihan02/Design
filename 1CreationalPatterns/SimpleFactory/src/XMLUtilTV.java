import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author ChenWeihan
 * @create 2021-11-28 13:15
 */
public class XMLUtilTV {
    public static String getBrandName() {
        try {
            // 创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("1CreationalPatterns\\SimpleFactory\\src\\configTV.xml"));

            // 获取包含品牌名称的文本节点
            NodeList n1 = doc.getElementsByTagName("brandName");
            Node classNode = n1.item(0).getFirstChild();
            String brandName = classNode.getNodeValue().trim();
            return brandName;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
