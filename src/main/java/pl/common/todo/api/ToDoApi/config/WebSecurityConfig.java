package pl.common.todo.api.ToDoApi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.addAllowedOrigin(CorsConfiguration.ALL);
		corsConfiguration.addAllowedHeader(CorsConfiguration.ALL);
		corsConfiguration.addAllowedMethod(HttpMethod.GET.name());
		corsConfiguration.addAllowedMethod(HttpMethod.POST.name());
		corsConfiguration.addAllowedMethod(HttpMethod.DELETE.name());
		corsConfiguration.addAllowedMethod(HttpMethod.PUT.name());

		http.cors().configurationSource(request -> new CorsConfiguration(corsConfiguration)).and().csrf().disable();
	}
}
