package cn.author.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
@Component
public class MyUserDetails implements UserDetailsService {
	Logger logger=LoggerFactory.getLogger(getClass());
			

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.info("登录的用户名是："+username);
		String password="123123";
		 User user = new User(username, password, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));	
		return user;
	}

}
