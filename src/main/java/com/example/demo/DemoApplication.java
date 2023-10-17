package com.example.demo;

import java.awt.Image;
import java.io.IOException;
import java.util.Random;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.config.BeanConfig;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext context =
new AnnotationConfigApplicationContext(BeanConfig.class);


String s = (String) context.getBean("bean1");
System.out.println(s);

Random r = (Random) context.getBean("bean2");
System.out.println(r.nextInt());

int i = (int) context.getBean("bean22");
System.out.println(i);

Bean33 b = (Bean33) context.getBean("bean33");
System.out.println(b.run());

Game game = (Game) context.getBean("game");
game.play();

Movie movie = (Movie) context.getBean("movie");
movie.play();

Music music = (Music) context.getBean("music");
music.play();

ImageUtil iu = (ImageUtil) context.getBean("imageUtil");
try{
	iu.save("http://ggoreb.com/images/luffy.jpg");
} catch (IOException e){
	e.printStackTrace();
}

((AnnotationConfigApplicationContext) context).close();

		// SpringApplication.run(DemoApplication.class, args);
	}

}
