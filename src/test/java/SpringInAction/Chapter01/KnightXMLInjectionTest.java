package SpringInAction.Chapter01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
/*
("classpath:SpringInAction/Chapter01/KnightXMLInjectionTest-context.xml")
后面这一串可要可不要， 因为test的resource中已经有了默认的xml配置文件
当然也可以用locations = {"classpath:SpringInAction/Chapter01/KnightXMLInjectionTest-context.xml"}
如果有多个xml文件，可以locations = {"classpath*:···.xml", "classpath*:···.xml"}
*/
public class KnightXMLInjectionTest {

  @Autowired
  Knight knight;

  @Autowired
  FakePrintStream printStream;

  @After
  public void clearPrintStream() {
    printStream.clear();
  }

  @Test
  public void shouldInjectKnightWithSlayDragonQuest() {
    knight.embarkOnQuest();
    assertEquals(
        "Fa la la, the Chapter01 is so brave!\n" +
        "Embarking on quest to slay the dragon!\n" +
        "Tee hee hee, the brave Chapter01 did embark on a quest!\n",
        printStream.getPrintedString());
  }

}
