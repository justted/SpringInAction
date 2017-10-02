package knight.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import knight.BraveKnight;
import knight.Knight;
import knight.Quest;
import knight.SlayDragonQuest;

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
