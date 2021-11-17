package com.camacode.learn_spring_security.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ProjectConfig2 extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomAuthenticationProvider customAuthenticationProvider;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(customAuthenticationProvider);

        //        var userDetailsService = new InMemoryUserDetailsManager();
//        var user = User.withUsername("sofiane")
//                .password("1234")
//                .authorities("read")
//                .build();
//        userDetailsService.createUser(user);
//        PasswordEncoder passwordEncoder = NoOpPasswordEncoder.getInstance();
//        auth.userDetailsService(userDetailsService)
//                .passwordEncoder(passwordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
        http.authorizeRequests()
                .anyRequest()
                .authenticated();
//                .permitAll();
    }
}


//        TO make https works fine and not rederect me to 8443 port
//        PortMapperImpl portMapper = new PortMapperImpl();
//        portMapper.setPortMappings(Collections.singletonMap("80","443"));
//        PortResolverImpl portResolver = new PortResolverImpl();
//        portResolver.setPortMapper(portMapper);
//        LoginUrlAuthenticationEntryPoint entryPoint = new LoginUrlAuthenticationEntryPoint("/login");
//        entryPoint.setPortMapper(portMapper);
//        entryPoint.setPortResolver(portResolver);
//        http
//                .exceptionHandling()
//                .authenticationEntryPoint(entryPoint)
//                ;