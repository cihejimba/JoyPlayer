package developer.shivam.joyplayer.injection.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import developer.shivam.joyplayer.injection.annotation.ApplicationContext;
import developer.shivam.joyplayer.ui.main.MainActivityComponent;

/*
 * Created by shivam on 23/6/17.
 */
@Module(
        subcomponents = {
                MainActivityComponent.class
        }
)
public class ApplicationModule {

    @Provides
    @ApplicationContext
    Context provideContext(Application application) {
        return application;
    }

}
