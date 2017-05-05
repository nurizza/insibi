package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.R;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.MajasSin;

/**
 * Created by Angga on 4/23/2017.
 */

public class MajasSinAdapter extends RecyclerView.Adapter<MajasSinAdapter.ViewHolder> {

    MajasSinAdapter.IMajasSinAdapter mIMajasSinAdapter;
    ArrayList<MajasSin> majassinList;

    public MajasSinAdapter(Context context, ArrayList<MajasSin> majassinList) {
        this.majassinList = majassinList;
        mIMajasSinAdapter = (MajasSinAdapter.IMajasSinAdapter) context;
    }

    @Override
    public MajasSinAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.majas_sin_layout, parent, false);
        MajasSinAdapter.ViewHolder vh = new MajasSinAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MajasSinAdapter.ViewHolder holder, int position) {
        MajasSin majassin = majassinList.get(position);
        holder.tvJudul.setText(majassin.judul);
    }

    @Override
    public int getItemCount() {
        if (majassinList != null)
            return majassinList.size();
        return 0;
    }

    public interface IMajasSinAdapter {
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
                    mIMajasSinAdapter.doClick(getAdapterPosition());
                }
            });
        }


    }

}