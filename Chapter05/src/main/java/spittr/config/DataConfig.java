package spittr.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class DataConfig {

  @Bean
  public DataSource dataSource() {
    return new EmbeddedDatabaseBuilder()
            .setType(EmbeddedDatabaseType.H2)
            .addScript("spittr/schema.sql")//这里又是因为路径的问题，让我耽搁了好久。以后一定要记住，main文件夹下的java，resources和webapp这三个文件夹算顶级，直接在其下的才不用写路径，在其下的文件夹里的一定要写路径！！！
            .build();
  }
  
  @Bean
  public JdbcOperations jdbcTemplate(DataSource dataSource) {
    return new JdbcTemplate(dataSource);
  }

}
