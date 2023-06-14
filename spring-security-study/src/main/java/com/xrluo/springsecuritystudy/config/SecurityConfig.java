package com.xrluo.springsecuritystudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChai(HttpSecurity httpSecurity) throws Exception {
        /**
         *  配置允许所有请求
         */
        // httpSecurity.authorizeHttpRequests((requests) -> requests.anyRequest().permitAll());
        /**
         *
         */
        /**
         * 这段代码使用了 Spring Security 6.1 的 HTTP 安全配置。其中，`.authorizeHttpRequests((requests) -> requests.requestMatchers("/").authenticated())`表示对根路径进行认证授权，即用户需要登录才能访问网站的首页。
         *
         * `.formLogin(Customizer.withDefaults())`表示启用表单登录功能，即用户可以通过提交表单的方式进行登录。
         *
         * `.httpBasic(Customizer.withDefaults())`表示启用 HTTP Basic 认证，即用户可以通过在请求头中传递用户名和密码的方式进行认证。
         *
         * 该配置还使用了 `Customizer.withDefaults()` 方法对默认的认证授权功能进行了自定义配置。
         */
        httpSecurity.authorizeHttpRequests((requests) -> requests.requestMatchers("/").authenticated()).formLogin(
                Customizer.withDefaults()).httpBasic(Customizer.withDefaults());
        return httpSecurity.build();
    }

}
