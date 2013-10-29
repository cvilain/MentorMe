package com.enigmasm.mentorme;

import android.app.Activity;
import android.view.View;
import com.firebase.client.Query;

/**
 * Created by lego6245 on 10/29/13.
 */
public class MentorListAdapter extends FirebaseListAdapter<MentorItem>{

    public MentorListAdapter(Query ref, Activity activity, int layout) {
        super(ref, MentorItem.class, layout, activity);

    }

    @Override
    protected void populateView(View v, MentorItem model) {
        return;
    }
}
