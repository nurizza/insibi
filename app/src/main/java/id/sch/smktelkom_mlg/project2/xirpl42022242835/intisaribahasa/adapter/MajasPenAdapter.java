package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.R;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.MajasPen;

/**
 * Created by Angga on 4/23/2017.
 */

public class MajasPenAdapter extends RecyclerView.Adapter<MajasPenAdapter.ViewHolder> {

    MajasPenAdapter.IMajasPenAdapter mIMajasPenAdapter;
    ArrayList<MajasPen> majaspenList;

    public MajasPenAdapter(Context context, ArrayList<MajasPen> majaspenList) {
        this.majaspenList = majaspenList;
        mIMajasPenAdapter = (MajasPenAdapter.IMajasPenAdapter) context;
    }

    @Override
    public MajasPenAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.majas_pen_layout, parent, false);
        MajasPenAdapter.ViewHolder vh = new MajasPenAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MajasPenAdapter.ViewHolder holder, int position) {
        MajasPen majaspen = majaspenList.get(position);
        holder.tvJudul.setText(majaspen.judul);
    }

    @Override
    public int getItemCount() {
        if (majaspenList != null)
            return majaspenList.size();
        return 0;
    }

    public interface IMajasPenAdapter {
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
                    mIMajasPenAdapter.doClick(getAdapterPosition());
                }
            });
        }


    }

}