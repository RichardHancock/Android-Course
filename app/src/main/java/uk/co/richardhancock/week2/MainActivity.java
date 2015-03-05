package uk.co.richardhancock.week2;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by apple on 05/03/2015.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_view);

        getFragmentManager().beginTransaction().replace(R.id.fragment_holder, new StoriesListFragment()).commit();
    }
}
