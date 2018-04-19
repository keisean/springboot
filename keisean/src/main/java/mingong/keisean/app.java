package mingong.keisean;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//项目启动时加载dao
//@MapperScan("mingong.keisean.dao")

@SpringBootApplication
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(app.class, args);
	}

}
