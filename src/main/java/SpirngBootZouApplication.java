import com.sxy.pojo.User;
import com.sxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpirngBootZouApplication {


	public static void main(String[] args) {
//		SpringApplication.run(SpirngBootZouApplication.class, args);
		UserService userService=new UserService();
		User user=new User("Zoudayi",155);
		System.out.println(userService.addUser(user));
	}
}
