package me.eric.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class HelloDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	HelloUserVO user;
	
	public List<Map<String, Object>> getId() {
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		list = jdbcTemplate.queryForList("select * from user_info");

		System.out.println("list=" + list.get(0).toString());
		
		String id = list.get(0).get("id").toString();
		 
		return list;
		
	}
	
}
