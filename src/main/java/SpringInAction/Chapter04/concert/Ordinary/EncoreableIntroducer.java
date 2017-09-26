package SpringInAction.Chapter04.concert.Ordinary;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "SpringInAction.Chapter04.concert.Ordinary.Performance+",
            defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}