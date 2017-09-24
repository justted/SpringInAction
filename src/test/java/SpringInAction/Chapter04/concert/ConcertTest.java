package SpringInAction.Chapter04.concert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class ConcertTest {
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private Audience audience;

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

}
