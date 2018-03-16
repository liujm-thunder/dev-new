package com.appchina.devnew.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={"classpath:applicationContext-service.xml"})
public class SpringConfigContext {

}
