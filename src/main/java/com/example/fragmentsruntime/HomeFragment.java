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
public class HomeFragment extends Fragment {

     private Button button;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // find the id
        button = view.findViewById(R.id.btnHomeFragment);

        //set onlickListener to the button
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //declare the Fragment Manager from the mainActivity
                MainActivity.fragmentManager.beginTransaction().replace(R.id.frameLayout, new SportsFragment(),null).commit();

            }
        });

        return view;
    }

}
