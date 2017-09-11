package SpringInAction.Chapter01.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
/*
* 感觉这个扫描组件不是这一章的，毕竟这一章的bean都是用xml文件来装配的
* 而且其他几个bean也没有使用@component注解
* */
@Configuration
@ComponentScan(basePackages = "SpringInAction",
               excludeFilters = { @Filter(Configuration.class) })
public class SoundSystemConfig {
}
