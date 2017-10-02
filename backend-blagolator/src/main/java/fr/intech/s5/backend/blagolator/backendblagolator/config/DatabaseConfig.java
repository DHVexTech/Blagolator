package fr.intech.s5.backend.blagolator.backendblagolator.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("fr.intech.s5.backend.blagolator.backendblagolator.repository")
@EnableTransactionManagement
public class DatabaseConfig {

}
