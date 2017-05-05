package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.R;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.Antonim;


/**
 * Created by Izza on 21/03/2017.
 */

public class AntonimAdapter extends RecyclerView.Adapter<AntonimAdapter.ViewHolder>{

    IAntonimAdapter mIAntonimAdapter;
    ArrayList<Antonim> antonimList;
    public AntonimAdapter(Context context, ArrayList<Antonim> antonimList){
        this.antonimList = antonimList;
        mIAntonimAdapter = (IAntonimAdapter) context;
    }
    @Override
    public AntonimAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v =LayoutInflater.from(parent.getContext()).inflate(R.layout.antonim_layout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(AntonimAdapter.ViewHolder holder, int position) {
        Antonim antonim = antonimList.get(position);
        holder.tvJudul.setText(antonim.judul);
    }

    @Override
    public int getItemCount() {
        if(antonimList!=null)
            return antonimList.size();
        return 0;
    }
    public interface IAntonimAdapter{
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
                    mIAntonimAdapter.doClick(getAdapterPosition());
                }
            });
        }


    }

}