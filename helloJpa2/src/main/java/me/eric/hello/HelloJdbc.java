package me.eric.hello;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;




@Component
public class HelloJdbc implements ApplicationRunner {
	
	private static final Logger LOG = LogManager.getLogger();
	
	@Autowired
	DataSource dataSource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		try (Connection connection = dataSource.getConnection()) {
			
			String URL = connection.getMetaData().getURL();
			String User = connection.getMetaData().getUserName();
			
			LOG.info("connection : {}", connection);
			LOG.info("URL : {}", URL);
			LOG.info("User : {}", User);
			
			/*
			 * Statement statement = connection.createStatement(); String sql =
			 * "CREATE TABLE ACCOUNT(" + "ID INTEGER NOT NULL," + "NAME VARCHAR(255)," +
			 * "PRIMARY KEY(ID))"; statement.executeUpdate(sql);
			 */
		}
//        jdbcTemplate.execute("INSERT INTO ACCOUNT VALUES(1, 'saelobi')");
//		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
//		list = jdbcTemplate.queryForList("select * from user_info");

//		System.out.println("list=" + list.get(0).toString());

	}

}
