package cap.stone.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Megan McKinney
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("cap.stone")
public class JpaIntegrationConfig {
}
