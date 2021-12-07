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
public class XMLUtil {
    public static Object getBean() {
        try {
            // 创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("2StructuralPatterns\\Proxy\\src\\config.xml"));

            // 获取包含类名的文本节点
            NodeList n1 = doc.getElementsByTagName("className");
            Node classNode = n1.item(0).getFirstChild();
            String className = classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class c = Class.forName(className);

            Object obj = c.getDeclaredConstructor().newInstance();

            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
