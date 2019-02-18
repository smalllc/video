//package cn.smallcc.config;
//
//
//import javax.sql.DataSource;
//
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//
///**
//* <p>Title: DBConfig.java</p>
//* <p>Description: </p>
//* <p>Copyright: Copyright (c) 2018</p>
//* <p>Company: www.smallcc.cn</p>
//* @author smallcc
//* @date 2018年12月14日
//* @version 1.0
//* @typename DBConfig
//*/
//@Configuration
//public class DBConfig {
//	 	@Bean(name="dataSource")
//		//限定描述符除了能根据名字进行注入，但能进行更细粒度的控制如何选择候选者
//	    @Qualifier(value="dataSource")
//		//用@Primary区分主数据源
//	    @Primary
//		//指定配置文件中，前缀为c3p0的属性值
//	    @ConfigurationProperties(prefix="c3p0.primary")
//	    public DataSource dataSource(){
//			//创建数据源
//	        return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
//	    }
//	    /**
//	    *返回sqlSessionFactory
//	    */
//	    @Bean
//	    public SqlSessionFactoryBean sqlSessionFactoryBean(){
//	        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
//	        sqlSessionFactory.setDataSource(dataSource());
//	        return sqlSessionFactory;
//	    }
//}
