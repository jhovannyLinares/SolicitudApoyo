package mx.gob.bienestar.presentacion.web.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;


@Configuration
@ComponentScan(basePackages = "mx.gob.bienestar")
public class WebMvcConfigurer {

//	private final Logger logger = Logger.getLogger(this.getClass());

	@Bean(name = "messageSource")
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:i18/messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}

}
