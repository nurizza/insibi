package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;


import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter.AwalanKeAdapter;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.AwalanKe;

public class AwalanKeActivity extends AppCompatActivity implements AwalanKeAdapter.IAwalanKeAdapter {

    ArrayList<AwalanKe> mList = new ArrayList<>();

    AwalanKeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awalan_ke_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.awalanke);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new AwalanKeAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }


    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.awalanke);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new AwalanKe(arJudul[i]));
        }
        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void doClick(int pos) {

    }
}