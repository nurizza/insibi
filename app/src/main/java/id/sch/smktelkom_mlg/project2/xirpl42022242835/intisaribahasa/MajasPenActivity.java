package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter.MajasPenAdapter;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.MajasPen;

/**
 * Created by Angga on 4/23/2017.
 */

public class MajasPenActivity extends AppCompatActivity implements MajasPenAdapter.IMajasPenAdapter {

    ArrayList<MajasPen> mList = new ArrayList<>();

    MajasPenAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.majas_pen_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.majaspen);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new MajasPenAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }


    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.majaspen);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new MajasPen(arJudul[i]));
        }
        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void doClick(int pos) {

    }
}
