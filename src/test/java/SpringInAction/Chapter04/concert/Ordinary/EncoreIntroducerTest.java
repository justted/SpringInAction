package SpringInAction.Chapter04.concert.Ordinary;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class EncoreIntroducerTest {
    @Autowired
    private Performance musicPerformance;

    @Test
    public void testEncore() {
        Encoreable encoreable = (Encoreable)musicPerformance; //使用方法
        encoreable.performEncore();
    }
    //可以看到，本来musicPerformance是Performance的实现，
    // 通过强转，我可以调用新接口中的方法了，而且没有修改原来的类和接口；
    // 而中间负责将函数调用委托给不同的实现对象的任务就是由切面自动完成。
}