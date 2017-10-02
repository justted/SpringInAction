package stereo_mixedconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("classpath:stereo_mixedconfig/cd-config.xml")
//这里的classpath也一定要写全路径！不然测试运行会报错！但是写代码的时候不会像@ContextConfiguration提示错误
public class SoundSystemConfig {

}
