package SpringInAction.Chapter03.externals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class EnvironmentConfigWithDefaults {

  @Autowired
  Environment env;
  
  @Bean
  public BlankDisc blankDisc() {
    return new BlankDisc(
        //这里并没有引入properties文件，故第一个属性值肯定无效
        env.getProperty("disc.title", "Rattle and Hum"),
        env.getProperty("disc.artist", "U2"));
  }
  
}
