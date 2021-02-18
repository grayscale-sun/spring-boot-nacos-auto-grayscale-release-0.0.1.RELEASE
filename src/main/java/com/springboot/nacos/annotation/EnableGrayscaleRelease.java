package com.springboot.nacos.annotation;


import com.springboot.nacos.config.EnableConfig;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(EnableConfig.class)
@ServletComponentScan(basePackages = "com.springboot.nacos.filter")
public @interface EnableGrayscaleRelease {

    boolean autoEnable() default true;

    String value() default "";

}
