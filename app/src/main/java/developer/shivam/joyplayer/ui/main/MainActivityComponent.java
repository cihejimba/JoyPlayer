package developer.shivam.joyplayer.ui.main;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import developer.shivam.joyplayer.injection.annotation.PerActivity;

/*
 * Created by shivam on 23/6/17.
 */
@Subcomponent
@PerActivity
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {

    }
}