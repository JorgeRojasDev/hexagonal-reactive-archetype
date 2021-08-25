#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId};

import ${package}.infraestructure.config.JpaConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.${artifactId}.SpringApplication;
import org.springframework.${artifactId}.autoconfigure.EnableAutoConfiguration;
import org.springframework.${artifactId}.autoconfigure.SpringBootApplication;
import org.springframework.${artifactId}.autoconfigure.domain.EntityScan;
import org.springframework.${artifactId}.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan("..")
@EnableScheduling
@Import(JpaConfig.class)
public class ProjectfApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectfApplication.class, args);
	}

}
