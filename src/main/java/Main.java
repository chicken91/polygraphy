package main.java;

import main.java.dao.UserDAO;
import main.java.model.User;
import main.java.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/resources/spring/application-context.xml");

        UserDAO userDAO= context.getBean("UserDAO", UserDAO.class);
        UserService userService = context.getBean("UserService", UserService.class);

        User user = new User();
        user.setUserId(3);
        user.setUsername("chicken");
        user.setPassword("qwerty");
        user.setConfirmPassword("qwerty");
        user.setEmail("chicken91@ukr.net");
        user.setNickname("Kulishenko");
        userService.addUser(user);

        System.out.println(userDAO.getUserByUsername("fdsfsdf"));
    }
}
