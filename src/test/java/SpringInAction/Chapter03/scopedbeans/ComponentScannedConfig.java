package SpringInAction.Chapter03.scopedbeans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(excludeFilters={@Filter(type=FilterType.ANNOTATION, value=Configuration.class)})
//excludeFilter 指定扫描到某个类时需要忽略它,这里type指定忽略注解类,value指定类名.此例中忽略的是ExplicitConfig类
public class ComponentScannedConfig {

}
