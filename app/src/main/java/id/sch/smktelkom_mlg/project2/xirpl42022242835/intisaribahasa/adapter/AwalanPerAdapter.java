package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.R;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.AwalanPer;


/**
 * Created by Izza on 21/03/2017.
 */

public class AwalanPerAdapter extends RecyclerView.Adapter<AwalanPerAdapter.ViewHolder>{

    IAwalanPerAdapter mIAwalanPerAdapter;
    ArrayList<AwalanPer> awalanperList;
    public AwalanPerAdapter(Context context, ArrayList<AwalanPer> awalanperList){
        this.awalanperList = awalanperList;
        mIAwalanPerAdapter = (IAwalanPerAdapter) context;
    }
    @Override
    public AwalanPerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.awalan_per_layout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(AwalanPerAdapter.ViewHolder holder, int position) {
        AwalanPer awalanper = awalanperList.get(position);
        holder.tvJudul.setText(awalanper.judul);
    }

    @Override
    public int getItemCount() {
        if(awalanperList!=null)
            return awalanperList.size();
        return 0;
    }
    public interface IAwalanPerAdapter{
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
                    mIAwalanPerAdapter.doClick(getAdapterPosition());
                }
            });
        }


    }

}