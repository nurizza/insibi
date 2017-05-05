package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;


import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter.AwalanPerAdapter;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.AwalanPer;

public class AwalanPerActivity extends AppCompatActivity implements AwalanPerAdapter.IAwalanPerAdapter {

    ArrayList<AwalanPer> mList = new ArrayList<>();

    AwalanPerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awalan_per_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.awalanper);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new AwalanPerAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }


    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.awalanper);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new AwalanPer(arJudul[i]));
        }
        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void doClick(int pos) {

    }
}