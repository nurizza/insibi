package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter.MajasPertAdapter;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.MajasPert;

/**
 * Created by Angga on 4/23/2017.
 */

public class MajasPertActivity extends AppCompatActivity implements MajasPertAdapter.IMajasPertAdapter {

    ArrayList<MajasPert> mList = new ArrayList<>();

    MajasPertAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.majas_pert_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.majaspert);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new MajasPertAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }


    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.majaspert);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new MajasPert(arJudul[i]));
        }
        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void doClick(int pos) {

    }
}

