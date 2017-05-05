package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.R;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.AwalanMe;


/**
 * Created by Izza on 21/03/2017.
 */

public class AwalanMeAdapter extends RecyclerView.Adapter<AwalanMeAdapter.ViewHolder>{

    IAwalanMeAdapter mIAwalanMeAdapter;
    ArrayList<AwalanMe> awalanmeList;
    public AwalanMeAdapter(Context context, ArrayList<AwalanMe> awalanmeList){
        this.awalanmeList = awalanmeList;
        mIAwalanMeAdapter = (IAwalanMeAdapter) context;
    }
    @Override
    public AwalanMeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.awalan_me_layout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(AwalanMeAdapter.ViewHolder holder, int position) {
        AwalanMe awalanme = awalanmeList.get(position);
        holder.tvJudul.setText(awalanme.judul);
    }

    @Override
    public int getItemCount() {
        if(awalanmeList!=null)
            return awalanmeList.size();
        return 0;
    }
    public interface IAwalanMeAdapter{
        void doClick(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul;

        public ViewHolder(View itemView)
        {
            super(itemView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIAwalanMeAdapter.doClick(getAdapterPosition());
                }
            });
        }


    }

}