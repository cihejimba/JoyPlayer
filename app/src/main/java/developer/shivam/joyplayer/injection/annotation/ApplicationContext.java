package developer.shivam.joyplayer.injection.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/*
 * Created by shivam on 22/6/17.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationContext {
    //Annotation to distinguish application context from activity context
}
