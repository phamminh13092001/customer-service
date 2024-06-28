package vn.fis.spro.customer.application.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "vn.fis.spro.customer")
@EnableTransactionManagement
@EnableJpaAuditing
public class JpaConfig {
}
