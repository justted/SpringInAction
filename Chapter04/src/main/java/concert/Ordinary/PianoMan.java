package concert.Ordinary;

import org.springframework.stereotype.Component;

@Component
public class PianoMan implements Performance {

    @Override
    public void perform() {
        System.out.println("Play the piano.");
    }
}
