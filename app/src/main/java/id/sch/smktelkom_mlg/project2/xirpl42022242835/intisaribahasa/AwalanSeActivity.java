package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;


import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;


import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter.AwalanSeAdapter;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.AwalanSe;

public class AwalanSeActivity extends AppCompatActivity implements AwalanSeAdapter.IAwalanSeAdapter {

    ArrayList<AwalanSe> mList = new ArrayList<>();

    AwalanSeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awalan_se_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.awalanse);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new AwalanSeAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }


    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.awalanse);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new AwalanSe(arJudul[i]));
        }
        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void doClick(int pos) {

    }
}
