package SpringInAction.Chapter04.concert.Around;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertAroungConfig.class)
public class ConcertAroundTest {
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private AudienceAround audienceAround;

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
