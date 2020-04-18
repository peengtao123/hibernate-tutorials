package cn.fox;

import cn.fox.dao.UserDao;
import javafx.application.Application;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;


public class Log4jTest {

    private static final Logger logger = LoggerFactory.getLogger(Log4jTest.class);

    @Test
    public void TestSay(){
        logger.debug("debug");
        logger.warn("warm");
        logger.error("error");
    }

    @Test
    public void say(){
        ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        UserDao userDao = context.getBean("userDao", UserDao.class);
        assertEquals("hello world", userDao.say());
        assertNotNull(userDao);
    }
}
