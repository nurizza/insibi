package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter.PeribahasaAdapter;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.Peribahasa;

/**
 * Created by Angga on 4/23/2017.
 */

public class PeribahasaActivity extends AppCompatActivity implements PeribahasaAdapter.IPeribahasaAdapter {

    ArrayList<Peribahasa> mList = new ArrayList<>();

    PeribahasaAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.peribahasa_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.peribahasa);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new PeribahasaAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }


    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.peribahasa);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new Peribahasa(arJudul[i]));
        }
        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void doClick(int pos) {

    }
}
