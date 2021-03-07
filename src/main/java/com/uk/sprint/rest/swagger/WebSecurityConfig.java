package com.uk.sprint.rest.swagger;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {

    protected void configure(HttpSecurity http) throws Exception {
        ((ExpressionUrlAuthorizationConfigurer.AuthorizedUrl) ((ExpressionUrlAuthorizationConfigurer
                .AuthorizedUrl) ((HttpSecurity) http.csrf()
                .disable()).authorizeRequests()
                .antMatchers(new String[]{"/v2/api-docs"}))
                .permitAll().anyRequest()).authenticated();
    }

    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(new String[]{"/v2/api-docs"});
    }

}
