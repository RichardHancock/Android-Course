package uk.co.richardhancock.week2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by apple on 05/03/2015.
 */
public class StoriesAdapter extends BaseAdapter {

    private Story[] items;

    public StoriesAdapter(Story[] objects) {

        this.items = objects;
    }


    public void setItems(Story[] items) {

        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        StoryViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_list_item, parent, false);

            holder = new StoryViewHolder();

            holder.title = (TextView)convertView.findViewById(R.id.title);
            holder.subtitle = (TextView)convertView.findViewById(R.id.subtitle);

            convertView.setTag(holder);
        }
        else
        {
            holder = (StoryViewHolder)convertView.getTag();
        }

        holder.title.setText( getItem(position).getTitle() );
        holder.subtitle.setText( getItem(position).getBody() );
        return convertView;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Story getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
