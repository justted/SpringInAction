package SpringInAction.Chapter01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import SpringInAction.Chapter01.BraveKnight;
import SpringInAction.Chapter01.Knight;
import SpringInAction.Chapter01.Quest;
import SpringInAction.Chapter01.SlayDragonQuest;

@Configuration
public class KnightConfig {

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }
  
  @Bean
  public Quest quest() {
    return new SlayDragonQuest(System.out);
  }

}
