package uk.co.richardhancock.week2;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

/**
 * Created by apple on 05/03/2015.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_view);

        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        transaction.replace(R.id.fragment_holder, new StoriesListFragment());

        if (findViewById(R.id.fragment2_holder) != null) {
            transaction.replace(R.id.fragment2_holder, new StoriesListFragment());
        }

        transaction.commit();
    }
}
