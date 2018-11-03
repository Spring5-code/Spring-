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
		//����spring�����ļ�
		Resource resource = new ClassPathResource("applicationContext.xml");
		//����spring��������
		BeanFactory factory=new XmlBeanFactory(resource);
		//��spring������ȡ��bean
		h1=(hello) factory.getBean("hello1");
		h1.sayHello();
		System.out.println(h1.getName());
	}
}
