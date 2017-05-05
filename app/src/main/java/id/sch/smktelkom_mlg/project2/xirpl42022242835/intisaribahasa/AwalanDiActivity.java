package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;


import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter.AwalanDiAdapter;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.AwalanDi;

public class AwalanDiActivity extends AppCompatActivity implements AwalanDiAdapter.IAwalanDiAdapter {

    ArrayList<AwalanDi> mList = new ArrayList<>();

    AwalanDiAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awalan_di_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.awalandi);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new AwalanDiAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }


    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.awalandi);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new AwalanDi(arJudul[i]));
        }
        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void doClick(int pos) {

    }
}