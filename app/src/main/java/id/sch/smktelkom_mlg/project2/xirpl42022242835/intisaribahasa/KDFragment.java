package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by Izza on 08/04/2017.
 */

public class KDFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_katadasar, container, false);
        ImageButton imageButton = (ImageButton) rootView.findViewById(R.id.btkatadasar);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                KataDasar();
            }
        });
        return rootView;
    }

    public void KataDasar() {

        Intent intent = new Intent(getActivity(), KDActivity.class);
        startActivity(intent);
    }
}
