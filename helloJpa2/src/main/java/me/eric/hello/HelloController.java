package me.eric.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = "application/json; charset=UTF-8")
public class HelloController {
	
	private static final Logger LOG = LogManager.getLogger();
	
	@Autowired
	HelloDao dao;
	
	@GetMapping("/getId")
	public List<Map<String, Object>> getId() {
		
		LOG.info("getId");
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		list = dao.getId();
		
		return list;
	}
	
	@PostMapping("/setId")
	public String setId() {
		
		return "성공";
	}
}
