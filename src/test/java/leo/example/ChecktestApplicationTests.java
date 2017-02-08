package leo.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChecktestApplicationTests {

    @Autowired
    private RestApiDeveloper apiDeveloper;

    @Test
    public void contextLoads() {
        Assert.assertNotNull(apiDeveloper);
    }

    @Test
    public void testInfo() {
        Assert.assertEquals(apiDeveloper.info(), "checktest service: developers api");
    }

}
