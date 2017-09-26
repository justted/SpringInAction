package SpringInAction.Chapter04.concert.Around;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy //开启AspectJ的自动代理机制
@ComponentScan
public class ConcertAroungConfig {
    @Bean
    public AudienceAround audienceAround() { //定义Audience的bean
        return new AudienceAround();
    }
}