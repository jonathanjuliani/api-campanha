package br.com.jj.campanha;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import br.com.jj.campanha.handlers.CampanhaHandler;

/*
 * A class that extends ResourceConfig from glassfish.jersey package
 * to enable registering our JAX-RS handlers (resources).
 * 
 * The @Component annotation ensures that this class will be registered
 * as the spring boot auto scans java classes in source folder
 */
@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(CampanhaHandler.class);
	}
}
