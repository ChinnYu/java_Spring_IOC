package test.org.jason; 

import org.jason.ZooService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* ZooService Tester. 
* 
* @author Liu 
* @since <pre>08/14/2018</pre> 
* @version 1.0 
*/ 
public class ZooServiceTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: play() 
* 
*/ 
@Test
public void testPlay() throws Exception {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc03.xml");
    ZooService service = ctx.getBean(ZooService.class);
    service.play();
} 


} 
