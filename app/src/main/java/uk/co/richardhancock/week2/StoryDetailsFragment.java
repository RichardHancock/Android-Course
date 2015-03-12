package uk.co.richardhancock.week2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by apple on 12/03/2015.
 */
public class StoryDetailsFragment extends Fragment{


    private TextView header;
    private TextView story;
    private ImageView featureImage;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.story_detail_view, container, false);

        header = (TextView) view.findViewById(R.id.header);
        story = (TextView) view.findViewById(R.id.story);
        featureImage = (ImageView) view.findViewById(R.id.feature_image);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (getArguments() != null)
        {
            String name = getArguments().getString("name");
            header.setText(name);
        }
        else
        {
            getActivity().finish();
        }

    }
}
