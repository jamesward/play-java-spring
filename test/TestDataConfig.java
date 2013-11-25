import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import configs.DataConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class TestDataConfig extends DataConfig {
    
    @Bean
    @Override
    public DataSource dataSource() {
        Config config = ConfigFactory.load();
        
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(config.getString("db.default.driver"));
        dataSource.setUrl(config.getString("db.default.url"));
        dataSource.setUsername(config.getString("db.default.user"));
        dataSource.setPassword(config.getString("db.default.password"));
        return dataSource;
    }
    
}
