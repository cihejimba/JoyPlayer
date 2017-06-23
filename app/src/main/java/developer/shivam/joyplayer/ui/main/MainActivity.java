package developer.shivam.joyplayer.ui.main;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import developer.shivam.joyplayer.R;
import developer.shivam.joyplayer.injection.annotation.ApplicationContext;

public class MainActivity extends AppCompatActivity {

    @ApplicationContext
    @Inject
    Context applicationContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (applicationContext == null) {
            System.out.println("You are not a developer");
        } else {
            System.out.println("You little little learned dagger 2.11");
        }

    }

}
