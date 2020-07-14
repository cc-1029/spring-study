import com.ccj.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ccj
 * @create 2020-07-12 16:12
 */
public class MyTest {

    public static void main(String[] args) {
        /**
         * //用户实际调用的是业务层，dao层他们不需要接触
         *         UserService userService = new UserServiceImpl();
         *         userService.setUserDao(new UserDaoOracleImpl());
         *         userService.getUser();
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean( "userServiceImpl");
        userServiceImpl.getUser();
    }
}
