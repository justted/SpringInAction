package SpringInAction.Chapter02.stereo_xmlconfig.properties;
import org.springframework.beans.factory.annotation.Autowired;

import SpringInAction.Chapter02.stereo_xmlconfig.CompactDisc;
import SpringInAction.Chapter02.stereo_xmlconfig.MediaPlayer;

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
