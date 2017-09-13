package SpringInAction.Chapter02.stereo_autoconfig;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:SpringInAction/Chapter02/stereo_autoconfig/soundsystem.xml")//测试类resource中单独有
/*
如果test的resource中已经有了默认的xml配置文件，那
("classpath:SpringInAction/Chapter02/stereo_autoconfig/soundsystem.xml")这一串可要可不要
但如果要使用main中的xml文件，则一定要添上
当然也可以用{"classpath:SpringInAction/Chapter01/KnightXMLInjectionTest-context.xml"}
如果有多个xml文件，可以locations = {"classpath*:···.xml", "classpath*:···.xml"}
*/
public class CDPlayerXMLConfigTest {

  @Rule
  public final SystemOutRule log = new SystemOutRule().enableLog();

  @Autowired
  private MediaPlayer player;

  @Autowired
  private CompactDisc cd;

  @Test
  public void cdShouldNotBeNull() {
    assertNotNull(cd);
  }
  
  @Test
  public void play() {
    player.play();
    assertEquals(
        "Playing Sgt. Pepper's Lonely Hearts Club Band" +
                " by The Beatles\r\n",
        log.getLog());
  }

}
