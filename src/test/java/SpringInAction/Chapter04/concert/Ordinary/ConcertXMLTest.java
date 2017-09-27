package SpringInAction.Chapter04.concert.Ordinary;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:SpringInAction/Chapter04/concert/Ordinary/Concert.xml"})
public class ConcertXMLTest {
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private Audience audience;
    //实际上切面在测试类中都可以不用显式装配，也即上面两行可以被注释

    @Autowired
    private Performance performance;

    @Test
    public void testConcert(){
        performance.perform();
        assertEquals("Silencing cell phones\r\n" +
                "Taking seats\r\n" +
                "Play the piano.\r\n" +
                "CLAP CLAP CLAP!!!\r\n",log.getLog());
    }

    @Test
    public void testEncore() {
        Encoreable encoreable = (Encoreable)performance; //使用方法
        encoreable.performEncore();
    }
    //可以看到，本来musicPerformance是Performance的实现，
    // 通过强转，我可以调用新接口中的方法了，而且没有修改原来的类和接口；
    // 而中间负责将函数调用委托给不同的实现对象的任务就是由切面自动完成。

}
