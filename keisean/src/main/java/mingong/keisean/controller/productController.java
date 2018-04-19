package mingong.keisean.controller;

import java.util.List;
import java.util.Map;



import mingong.keisean.service.productService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping("/product")
public class productController {
	Gson gson = new Gson();
	private final Logger log = LoggerFactory.getLogger(productController.class);
	@Autowired
	private productService productService; 
	
	@RequestMapping("/all")
	public String all(){
		log.info("start query all products");;
		List<Map<String, Object>> list = productService.get();
		return gson.toJson(list);
	}
}
