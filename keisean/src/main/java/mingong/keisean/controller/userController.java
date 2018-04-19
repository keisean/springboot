package mingong.keisean.controller;

import java.util.Map;

import javax.annotation.Resource;

import mingong.keisean.service.userService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class userController {
	Gson gson = new Gson();
	private final Logger log = LoggerFactory.getLogger(userController.class);
	@Autowired
	private userService userService; 
	
	@RequestMapping("/hello")
	public String hello(){
		log.info("你好,这是日志打印测试");
		return "hello spring-boot";
	}
	
	@RequestMapping("/save")
	public String save(String name){
		userService.save(name);
		return "save user success.";
	}
	
	@RequestMapping("/get")
	public String get(int id){
		Map map = userService.get(id);
		return gson.toJson(map);
	}
}
