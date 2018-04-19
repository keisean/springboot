package mingong.keisean.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import mingong.keisean.dao.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
	@Autowired
	private UserMapper userMapper;
	
	public void save(String name){
		Map<String, Object> user = new HashMap<String, Object>();
//		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
//		user.put("uuid", uuid);
		user.put("name", name);
		userMapper.insert(user);
	}
	
	public Map<String, Object> get(int id){
		Map<String, Object> user = userMapper.get(id);
		return user;
	}
}
