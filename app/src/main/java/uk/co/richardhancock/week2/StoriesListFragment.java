package uk.co.richardhancock.week2;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by apple on 05/03/2015.
 */
public class StoriesListFragment extends Fragment implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    private ListView listView;
    private StoriesAdapter adapter;



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

        adapter = new StoriesAdapter(names);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Toast.makeText(getActivity(), position + " was clicked", Toast.LENGTH_SHORT).show();
        Intent details = new Intent(getActivity(), StoryDetailsActivity.class);

        details.putExtra("name", adapter.getItem(position));

        startActivity(details);
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(), position + " was long clicked", Toast.LENGTH_SHORT).show();
        return false;
    }
}
