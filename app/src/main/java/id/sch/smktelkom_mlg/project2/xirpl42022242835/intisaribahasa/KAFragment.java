package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Izza on 08/04/2017.
 */


public class KAFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_awalan, container, false);
        ImageButton imageButton = (ImageButton) rootView.findViewById(R.id.btawalan);
        imageButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Awalan();
            }
        });
        return rootView;
    }
    public void Awalan() {

        Intent intent = new Intent(getActivity(), AwalanActivity.class);
        startActivity(intent);
    }
}