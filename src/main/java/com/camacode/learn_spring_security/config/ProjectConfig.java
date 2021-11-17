//package com.camacode.learn_spring_security.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//public class ProjectConfig extends WebSecurityConfigurerAdapter {
//
//    @Bean
//    public UserDetailsService getUserDetailsService(){
//        var userDetailsService = new InMemoryUserDetailsManager();
//        var user = User.withUsername("sofiane")
//                                    .password("1234")
//                                    .authorities("read")
//                                    .build();
//        userDetailsService.createUser(user);
//        return userDetailsService;
//    }
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.httpBasic();
//        http.authorizeRequests()
//                .anyRequest().permitAll();//.authenticated();
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
////        TO make https works fine and not rederect me to 8443 port
////        PortMapperImpl portMapper = new PortMapperImpl();
////        portMapper.setPortMappings(Collections.singletonMap("80","443"));
////        PortResolverImpl portResolver = new PortResolverImpl();
////        portResolver.setPortMapper(portMapper);
////        LoginUrlAuthenticationEntryPoint entryPoint = new LoginUrlAuthenticationEntryPoint("/login");
////        entryPoint.setPortMapper(portMapper);
////        entryPoint.setPortResolver(portResolver);
////        http
////                .exceptionHandling()
////                .authenticationEntryPoint(entryPoint)
////                ;