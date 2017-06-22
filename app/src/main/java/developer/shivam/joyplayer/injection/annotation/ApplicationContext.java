package developer.shivam.joyplayer.injection.annotation;

/*
 * Created by shivam on 22/6/17.
 */
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationContext {
    //Annotation to distinguish application context from activity context
}
