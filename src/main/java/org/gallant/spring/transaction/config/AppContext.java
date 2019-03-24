package org.gallant.spring.transaction.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@ImportResource(locations = { "classpath:spring/*" })
@PropertySource("classpath:config/datasource.properties")
@ComponentScan(basePackages = "org.gallant.spring")
@MapperScan("org.gallant.spring.transaction.mapper")
@EnableTransactionManagement
public class AppContext {

}