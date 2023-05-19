package com.shaliniUdemy.learnspringframework;

import com.shaliniUdemy.learnspringframework.game.GameRunner;
import com.shaliniUdemy.learnspringframework.game.GamingConsole;
import com.shaliniUdemy.learnspringframework.game.PacMan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
      var context=  new AnnotationConfigApplicationContext(GamingConfiguration.class);
      context.getBean(GamingConsole.class).up();
    }
}
