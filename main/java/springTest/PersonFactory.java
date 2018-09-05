package springTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PersonFactory {

    public Person getBean(String bean) throws Exception {
        Properties properties = new Properties();
        // 使用ClassLoader加载properties配置文件生成对应的输入流
        InputStream in = PersonFactory.class.getClassLoader().getResourceAsStream("spring.properties");
        // 使用properties对象加载输入流
        properties.load(in);
        //获取key对应的value值
        String property = properties.getProperty(bean);
        return (Person) Class.forName(property).newInstance();
    }

}
