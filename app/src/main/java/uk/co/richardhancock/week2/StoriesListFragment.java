package uk.co.richardhancock.week2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by apple on 05/03/2015.
 */
public class StoriesListFragment extends Fragment{

    private ListView listView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.story_list_view, container, false);
        listView = (ListView) view.findViewById(R.id.list_view);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] names = {
                "Terry", "Bob", "Bob2", "tell", "meh", "Bob", "Bob2", "tell", "meh", "Bob", "Bob2", "tell", "meh",
                "Terry", "Bob", "Bob2", "tell", "meh", "Bob", "Bob2", "tell", "meh", "Bob", "Bob2", "tell", "meh",
                "Terry", "Bob", "Bob2", "tell", "meh", "Bob", "Bob2", "tell", "meh", "Bob", "Bob2", "tell", "meh",
                "Terry", "Bob", "Bob2", "tell", "meh", "Bob", "Bob2", "tell", "meh", "Bob", "Bob2", "tell", "meh"
        };

        ListAdapter adapter = new StoriesAdapter( names);
        listView.setAdapter(adapter);
    }
}
