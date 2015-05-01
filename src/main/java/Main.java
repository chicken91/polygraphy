package main.java;

import main.java.dao.UserDAO;
import main.java.entity.User;
import main.java.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/resources/spring/application-context.xml");

        UserDAO userDAO= context.getBean("UserDAO", UserDAO.class);
        UserService userService = context.getBean("UserService", UserService.class);

        /*User user = new User();
        user.setUserId(1);
        user.setUsername("chicken91");
        user.setPassword("psp003670");
        user.setConfirmPassword("psp003670");
        user.setEmail("chicken91@ukr.net");
        user.setNickname("Kulishenko");
        userService.addUser(user);*/

        System.out.println(userDAO.getUserByUsername("fdsfsdf"));
    }
}
