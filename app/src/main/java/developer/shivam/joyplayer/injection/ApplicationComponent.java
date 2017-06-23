package developer.shivam.joyplayer.injection;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import developer.shivam.joyplayer.MyApplication;
import developer.shivam.joyplayer.injection.module.ApplicationModule;

/*
 * Created by shivam on 23/6/17.
 *
 * This is the main component of application or the ancestor component.
 * Our application have only one application class. That's why we have one
 * application component. This component is root of our dagger graph.
 */
@Singleton
@Component(
        modules = {
                AndroidInjectionModule.class,
                ApplicationModule.class,
                ActivityBuilder.class
        }
)
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder applicationComponent(Application application);

        ApplicationComponent build();

    }

    void inject(MyApplication application);
}
