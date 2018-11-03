package springTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//����spring��jUnit4
@RunWith(SpringJUnit4ClassRunner.class)
//���������ö���
@ContextConfiguration("classpath:springTest/springTest.xml")
public class APPTest {
	@Autowired
	private SomeBean bean;
	
	@Test
	public void test1() throws Exception {
		bean.dowork();
	}
}
