package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;

/**
 * Created by Izza on 03/05/2017.
 */


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter.MajasPerbAdapter;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.MajasPerb;

public class MajasPerbActivity extends AppCompatActivity implements MajasPerbAdapter.IMajasPerbAdapter {

    ArrayList<MajasPerb> mList = new ArrayList<>();

    MajasPerbAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.majas_perb_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.majasperb);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new MajasPerbAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }


    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.majasperb);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new MajasPerb(arJudul[i]));
        }
        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void doClick(int pos) {

    }
}


