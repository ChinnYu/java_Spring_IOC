package test.com.jason.service; 

import com.jason.dao.IBookDao;
import com.jason.model.Book;
import com.jason.service.BookService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* BookService Tester. 
* 
* @author Liu 
* @since <pre>08/13/2018</pre> 
* @version 1.0 
*/ 
public class BookServiceTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: save(String name) 
* 
*/ 
@Test
public void testSave() throws Exception {
    BookService service = new BookService();
    service.save("spring從入門到精通");
} 

@Test
public void constructor(){
    //根據ioc.xml配置文件初始化spring容器
    ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc01.xml");
    //從容器中獲得實體(bean)
    Book book = (Book) ctx.getBean("bookSpring");
    System.out.println(book);
}

    @Test
    public void PropertyTest(){
        //根據ioc.xml配置文件初始化spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc01.xml");
        //從容器中獲得實體(bean)
        Book book = (Book) ctx.getBean("bookMVC");
        Book book2 = (Book) ctx.getBean("bookMVC");
        System.out.println(book);
        System.out.println(book==book2);
    }
} 
