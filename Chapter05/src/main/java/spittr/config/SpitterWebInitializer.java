package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import spittr.web.WebConfig;

public class SpitterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
  
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[] { RootConfig.class };
  }
  //配置ContextLoaderListener创建的应用上下文中的bean，用于应用其他地方

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] { WebConfig.class };
  }
  //配置DispatcherServlet应用上下文中的bean，主要是包含web组件的bean

  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }

}