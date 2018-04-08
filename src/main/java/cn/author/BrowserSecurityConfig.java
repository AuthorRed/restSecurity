package cn.author;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import core.validate.code.image.ValidateCodeFilter;
@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		ValidateCodeFilter validateCodeFilter = new ValidateCodeFilter();
//		validateCodeFilter.setAuthenticationFailureHandler(authenticationFailureHandler);
		
		http.addFilterBefore(validateCodeFilter, UsernamePasswordAuthenticationFilter.class)
		.formLogin().loginPage("/imooc-signIn.html")
		.loginProcessingUrl("/authentication/form")
//		http.formLogin()
		.and()		
		.authorizeRequests()
		.antMatchers("/imooc-signIn.html","/code/image").permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.csrf().disable()
		;
	}
	
}
