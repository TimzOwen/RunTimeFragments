package com.example.fragmentsruntime;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class SportsFragment extends Fragment {

    private Button button;


    public SportsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_sports, container, false);

        button = view.findViewById(R.id.btn_Sports_Frag);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //create the fragment manager here and call the other transactions
                MainActivity.fragmentManager.beginTransaction().replace(R.id.frameLayout, new GithubFragment(), null).commit();
            }
        });

        return view;
    }

}
