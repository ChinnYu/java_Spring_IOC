package test.net.jason.service; 

import net.jason.service.CarService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* CarService Tester. 
* 
* @author Liu 
* @since <pre>08/13/2018</pre> 
* @version 1.0 
*/ 
public class CarServiceTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: remove(int id) 
* 
*/ 
@Test
public void testRemove() throws Exception {
    CarService service = new CarService();
    service.remove(1087);
} 


} 
