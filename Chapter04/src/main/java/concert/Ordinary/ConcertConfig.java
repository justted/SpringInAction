package concert.Ordinary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy //开启AspectJ的自动代理机制
@ComponentScan
public class ConcertConfig {
    @Bean
    public Audience audience() { //定义Audience的bean
        return new Audience();
    }

    @Bean
    public EncoreableIntroducer encoreableIntroducer() {
        return  new EncoreableIntroducer();
    }
}