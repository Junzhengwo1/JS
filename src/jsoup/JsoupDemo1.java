package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;


/**
 * @author JIAJUN KOU
 */
public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        //获取Document对象
        //获取student.xml的path  类加载器获取路径。
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        //加载文档进内存
        Document document = Jsoup.parse(new File(path), "utf-8");
        //获取元素
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());

        //获取tom。获取第一个
        Element element = elements.get(0);
        //获取数据
        String name = element.text();
        System.out.println(name);


    }


}
