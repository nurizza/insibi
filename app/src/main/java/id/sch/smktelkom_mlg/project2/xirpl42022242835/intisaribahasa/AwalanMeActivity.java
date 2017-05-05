package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;

/**
 * Created by Izza on 20/04/2017.
 */


import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;


import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter.AwalanMeAdapter;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.AwalanMe;

public class AwalanMeActivity extends AppCompatActivity implements AwalanMeAdapter.IAwalanMeAdapter {

    ArrayList<AwalanMe> mList = new ArrayList<>();

    AwalanMeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awalan_me_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.awalanme);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new AwalanMeAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }


    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.awalanme);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new AwalanMe(arJudul[i]));
        }
        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void doClick(int pos) {

    }
}
