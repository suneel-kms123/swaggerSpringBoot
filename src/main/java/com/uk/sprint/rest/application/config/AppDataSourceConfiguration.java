package com.uk.sprint.rest.application.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy;
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.Properties;

@Configuration(proxyBeanMethods = false)
@Slf4j
@EnableJpaRepositories(
        basePackages = "com.uk.sprint.rest.repository",
        entityManagerFactoryRef = "springBootEntityManager",
        transactionManagerRef = "springBootTransactionManager"
)
public class AppDataSourceConfiguration {

    @Bean
    public HikariDataSource springBootDataSource() {
       final HikariConfig config = sprinBootHikariConfig();
       config.setUsername("root");
       config.setPassword("secret");
       config.setJdbcUrl("jdbc:mysql://localhost:3306/airlines");
       config.addDataSourceProperty("hibernate.hbm2ddl.auto", "update");
       log.info("config -->" + config.getConnectionTimeout());
       return new HikariDataSource(config);
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public HikariConfig sprinBootHikariConfig() {
        return new HikariConfig();
    }

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean springBootEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(springBootDataSource());
        em.setPackagesToScan("com.uk.sprint");
        Properties props = new Properties();
        props.setProperty("hibernate.physical_naming_strategy", SpringPhysicalNamingStrategy.class.getName());
        props.setProperty("hibernate.implicit_naming_strategy", SpringImplicitNamingStrategy.class.getName());
        em.setJpaProperties(props);
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return em;
    }

    @Bean
    public PlatformTransactionManager springBootTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(springBootEntityManager().getObject());
        return transactionManager;
    }

}
