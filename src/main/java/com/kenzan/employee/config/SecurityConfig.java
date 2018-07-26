package com.kenzan.employee.config;

import com.canopyaudience.model.services.factory.HibernateFactory;
import javax.sql.DataSource;
import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

        @Autowired
	private DataSource securityDataSource;
	
        Session session = fetchSession();
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// use jdbc authentication ... oh yeah!!!
		
		auth.jdbcAuthentication().dataSource(securityDataSource);

        }
    
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
			// .antMatchers("/").hasRole("EMPLOYEE")
			// .antMatchers("/leaders/**").hasRole("MANAGER")
			// .antMatchers("/systems/**").hasRole("ADMIN")
                        .antMatchers("/myads/**").permitAll()
                        .antMatchers("/consumer/**").permitAll()
                        // .antMatchers("/preference/**").permitAll()
                        .antMatchers("/adimpression/**").permitAll()
                        .and()
                        
                        .authorizeRequests()
                        .anyRequest()
                        .authenticated()
                        .and()
                        // .anyRequest().authenticated()
                        // .and()
                        .formLogin()
				.loginPage("/showMyLoginPage")
				.loginProcessingUrl("/authenticateTheUser")
				.permitAll()
			.and()
			.logout().permitAll()
			.and()
			.exceptionHandling().accessDeniedPage("/access-denied");
		
	}
        
        public void configure(WebSecurity web) throws Exception {
            web.ignoring().antMatchers("/preference/**");
        }
        
        
        
        
        /**
	 * Gets a hibernate session from HibernateFactory
	 * 
	 * @return org.hibernate.Session
	 * 
	 */
	private Session fetchSession()
	{
			// log.info ("******Fetching Hibernate Session");

			Session session = HibernateFactory.currentSession();

			return session;
	    
	} //end fetchConnection
        
        
		
}






