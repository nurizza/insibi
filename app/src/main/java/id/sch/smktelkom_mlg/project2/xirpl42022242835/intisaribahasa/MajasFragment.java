package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;

/**
 * Created by Izza on 05/05/2017.
 */


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 */
public class MajasFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_majas, container, false);
        ImageButton imageButton = (ImageButton) rootView.findViewById(R.id.btMajas);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Majas();
            }
        });
        return rootView;
    }

    public void Majas() {

        Intent intent = new Intent(getActivity(), MajasActivity.class);
        startActivity(intent);
    }
}

