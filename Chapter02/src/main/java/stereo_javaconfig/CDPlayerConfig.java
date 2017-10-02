package stereo_javaconfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CDPlayerConfig {
  
  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
  
  @Bean
  public MediaPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
    //return new CDPlayer(sgtPeppers());上面的方法更好
  }


}
