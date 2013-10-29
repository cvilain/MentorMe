package com.enigmasm.mentorme;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.engimasm.mentorme.R;
import com.firebase.client.Firebase;

/**
 * Created by lego6245 on 10/29/13.
 */
public class MainListFragment extends Fragment {

    Firebase ref;
    final String FIREBASE_URL = "https://mentorapp.firebaseio.com/";

    public void onCreate(Bundle savedInstanceState) {
        ref = new Firebase(FIREBASE_URL);
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.mainlist_fragment, null);

        MentorItem item1 = new MentorItem("William", "looking for hot mentoring action", "lets get down to buisness to defeat the huns", "lego6245@gmail.com");

        MentorListAdapter mentorListAdapter = new MentorListAdapter(ref.limit(50), this.getActivity(), R.layout.mentoritem);

        return v;
    }

}
