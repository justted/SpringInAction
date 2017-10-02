package knight;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

  public static void main(String[] args) throws Exception {
    ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext(
                "knight.xml", "minstrel.xml");
    knight.Knight knight = context.getBean(knight.Knight.class);
    knight.embarkOnQuest();
    context.close();
  }

}
