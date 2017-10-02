package knight;

import java.io.PrintStream;


public class Minstrel {

  private PrintStream stream;
  
  public Minstrel(PrintStream stream) {
    this.stream = stream;
  }

  public void singBeforeQuest() {
    stream.println("Fa la la, the Chapter01 is so brave!");
  }

  public void singAfterQuest() {
    stream.println("Tee hee hee, the brave Chapter01 " +
    		"did embark on a quest!");
  }

}
