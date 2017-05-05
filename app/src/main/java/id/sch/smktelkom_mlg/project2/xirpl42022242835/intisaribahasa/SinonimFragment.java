package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;

/**
 * Created by Izza on 03/05/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class SinonimFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_import, container, false);
        ImageButton imageButton = (ImageButton) rootView.findViewById(R.id.btsinonim);
        imageButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Sinonim();
            }
        });
        return rootView;
    }
    public void Sinonim() {

        Intent intent = new Intent(getActivity(), SinonimActivity.class);
        startActivity(intent);
    }
}
