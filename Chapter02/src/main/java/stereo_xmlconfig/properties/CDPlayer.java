package stereo_xmlconfig.properties;
import org.springframework.beans.factory.annotation.Autowired;

import stereo_xmlconfig.CompactDisc;
import stereo_xmlconfig.MediaPlayer;

public class CDPlayer implements MediaPlayer {
  private CompactDisc compactDisc;

  @Autowired
  public void setCompactDisc(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
  }

  public void play() {
    compactDisc.play();
  }

}
