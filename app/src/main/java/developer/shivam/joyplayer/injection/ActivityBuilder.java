package developer.shivam.joyplayer.injection;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import developer.shivam.joyplayer.ui.main.MainActivity;
import developer.shivam.joyplayer.ui.main.MainActivityComponent;

/*
 * Created by shivam on 23/6/17.
 *
 * We map all activities here.
 */
@Module
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);
}
