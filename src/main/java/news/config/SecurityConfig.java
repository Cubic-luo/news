package news.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.sql.DataSource;

@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        CharacterEncodingFilter filter1 = new CharacterEncodingFilter();
        filter1.setEncoding("utf-8");
        http.addFilterBefore(filter1, ChannelProcessingFilter.class).formLogin().loginPage("/user/login").and().rememberMe().and().logout()
                .logoutSuccessUrl("/").and().authorizeRequests().antMatchers("/user").authenticated()
                .anyRequest().permitAll().and().csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("select username,password,true from news_user WHERE username=?")
                .authoritiesByUsernameQuery("select username,role from news_user where username=?");
    }

}
