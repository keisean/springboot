package mingong.keisean.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	void insert(Map<String, Object> user);
	
	Map<String, Object> get(int id);
}
