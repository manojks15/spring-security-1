
  package com.security.security;
  
  import org.springframework.context.annotation.Bean; import
  org.springframework.context.annotation.Configuration; import
  org.springframework.security.config.annotation.web.configuration.
  EnableWebSecurity; import org.springframework.security.core.userdetails.User;
  import org.springframework.security.core.userdetails.UserDetails; import
  org.springframework.security.core.userdetails.UserDetailsService; import
  org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
  org.springframework.security.crypto.password.PasswordEncoder; import
  org.springframework.security.provisioning.InMemoryUserDetailsManager;
  
  @Configuration
  
  @EnableWebSecurity public class SecurityConfig {
  
  @Bean public UserDetailsService userDetailsService(PasswordEncoder encoder) {
  UserDetails user1 = User.withUsername("manoj")
  .password(encoder.encode("pass")).roles("user").build();
  
  UserDetails user2 =
  User.withUsername("admin").password(encoder.encode("admin")).build(); return
  new InMemoryUserDetailsManager(user1,user2); }
  
  @Bean public PasswordEncoder passwordencode() { return new
  BCryptPasswordEncoder(); }
  
  }
 