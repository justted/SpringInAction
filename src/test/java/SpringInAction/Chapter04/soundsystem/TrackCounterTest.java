package SpringInAction.Chapter04.soundsystem;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {
    @Autowired
    private CompactDisc cd;

    @Autowired
    private TrackCounter counter;

    @Test
    public void testTrackCounter() {
        cd.playTrack(0);
        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(2);
        cd.playTrack(2);
        cd.playTrack(2);
        cd.playTrack(6);
        cd.playTrack(6);

        assertEquals(1, counter.getPlayCount(0));
        assertEquals(1, counter.getPlayCount(1));
        assertEquals(4, counter.getPlayCount(2));
        assertEquals(0, counter.getPlayCount(3));
        assertEquals(0, counter.getPlayCount(4));
        assertEquals(0, counter.getPlayCount(5));
        assertEquals(2, counter.getPlayCount(6));
    }
}