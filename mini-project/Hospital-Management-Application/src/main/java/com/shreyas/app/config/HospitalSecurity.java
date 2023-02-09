package com.shreyas.app.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class HospitalSecurity extends WebSecurityConfigurerAdapter {

    protected void configure(HttpSecurity http) throws Exception{
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/doctor/doctorappointment").hasAnyRole("DOCTOR")
                .antMatchers(HttpMethod.GET, "/patient/patientappointment").hasAnyRole("PATIENT")
                .antMatchers(HttpMethod.POST, "/doctor/save").hasAnyRole("DOCTOR")
                .antMatchers(HttpMethod.POST, "/patient/save").hasAnyRole("PATIENT")
                .antMatchers(HttpMethod.GET,"/prescription/viewprescription").hasAnyRole("PATIENT","DOCTOR")
                .antMatchers(HttpMethod.POST,"/prescription/saveprescription").hasAnyRole("PATIENT","DOCTOR")
                .and().csrf().disable().headers()
                .frameOptions().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("doctor456").password("{noop}password").roles("DOCTOR").and().withUser("patient456").password("{noop}password").roles("PATIENT");
    }
}



