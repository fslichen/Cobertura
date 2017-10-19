package evolution;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import evolution.service.AnyClass;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnyClassTest {
	@Test
	public void testAnyMethod() {
		Assert.assertTrue("Hello World".equals(new AnyClass().anyMethod()));
	}
}
