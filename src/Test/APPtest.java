package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import hello.hello;

public class APPtest {
	@Test
	public void testIOC() throws Exception {
		hello h1=null;
		//加载spring配置文件
		Resource resource = new ClassPathResource("applicationContext.xml");
		//创建spring容器对象
		BeanFactory factory=new XmlBeanFactory(resource);
		//从spring容器中取出bean
		h1=(hello) factory.getBean("hello1");
		h1.sayHello();
		System.out.println(h1.getName());
	}
}
