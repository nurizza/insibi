package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.R;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.KataDasar;

/**
 * Created by Angga on 4/24/2017.
 */

public class KataDasarAdapter extends RecyclerView.Adapter<KataDasarAdapter.ViewHolder> {

    KataDasarAdapter.IKataDasarAdapter mIKataDasarAdapter;
    ArrayList<KataDasar> katadasarList;

    public KataDasarAdapter(Context context, ArrayList<KataDasar> katadasarList) {
        this.katadasarList = katadasarList;
        mIKataDasarAdapter = (KataDasarAdapter.IKataDasarAdapter) context;
    }

    @Override
    public KataDasarAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.katadasar_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(KataDasarAdapter.ViewHolder holder, int position) {
        KataDasar katadasar = katadasarList.get(position);
        holder.tvJudul.setText(katadasar.judul);
    }

    @Override
    public int getItemCount() {
        if (katadasarList != null)
            return katadasarList.size();
        return 0;
    }

    public interface IKataDasarAdapter {
        void doClick(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul;

        public ViewHolder(View itemView) {
            super(itemView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIKataDasarAdapter.doClick(getAdapterPosition());
                }
            });
        }


    }

}
