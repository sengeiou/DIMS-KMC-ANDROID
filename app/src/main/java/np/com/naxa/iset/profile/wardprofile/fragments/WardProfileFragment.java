package np.com.naxa.iset.profile.wardprofile.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import np.com.naxa.iset.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WardProfileFragment extends Fragment {


    public WardProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ward_profile, container, false);
    }

}
