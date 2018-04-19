package mingong.keisean.service;

import java.util.List;
import java.util.Map;

import mingong.keisean.dao.ProductMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productService {
	@Autowired
	private ProductMapper productMapper;
	
	public List<Map<String, Object>> get(){
		List<Map<String, Object>> products = productMapper.get();
		return products;
	}
}
