package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.R;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.AwalanSe;


/**
 * Created by Izza on 21/03/2017.
 */

public class AwalanSeAdapter extends RecyclerView.Adapter<AwalanSeAdapter.ViewHolder>{

    IAwalanSeAdapter mIAwalanSeAdapter;
    ArrayList<AwalanSe> awalanseList;
    public AwalanSeAdapter(Context context, ArrayList<AwalanSe> awalanseList){
        this.awalanseList = awalanseList;
        mIAwalanSeAdapter = (IAwalanSeAdapter) context;
    }
    @Override
    public AwalanSeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.awalan_se_layout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(AwalanSeAdapter.ViewHolder holder, int position) {
        AwalanSe awalanse = awalanseList.get(position);
        holder.tvJudul.setText(awalanse.judul);
    }

    @Override
    public int getItemCount() {
        if(awalanseList!=null)
            return awalanseList.size();
        return 0;
    }
    public interface IAwalanSeAdapter{
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
                    mIAwalanSeAdapter.doClick(getAdapterPosition());
                }
            });
        }


    }

}
