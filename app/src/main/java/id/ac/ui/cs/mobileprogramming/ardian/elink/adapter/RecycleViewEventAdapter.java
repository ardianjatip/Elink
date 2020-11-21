package id.ac.ui.cs.mobileprogramming.ardian.elink.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.ui.cs.mobileprogramming.ardian.elink.utils.MyCommunicator;
import id.ac.ui.cs.mobileprogramming.ardian.elink.R;
import id.ac.ui.cs.mobileprogramming.ardian.elink.entity.Event;

public class RecycleViewEventAdapter extends RecyclerView.Adapter<RecycleViewEventAdapter.ViewHolder> {
    private static final String TAG = "RecycleViewEventAdapter";
    private Context mContext;
    private List<Event> mEvents = new ArrayList<>();


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item, parent, false);
        mContext = parent.getContext();
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.namaKegiatan.setText(mEvents.get(position).getName());
        holder.deskripsiKegiatan.setText(mEvents.get(position).getDescription());
        holder.namaPembuatKegiatan.setText(String.valueOf(mEvents.get(position).getId()));
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCommunicator myCommunicator = (MyCommunicator) mContext;
                myCommunicator.displayDetails(mEvents.get(position));
            }
        });
    }

    public void setmKegiatans(List<Event> events){
        this.mEvents = events;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mEvents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView namaKegiatan;
        TextView deskripsiKegiatan;
        TextView namaPembuatKegiatan;
        ConstraintLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaKegiatan = itemView.findViewById(R.id.nama_kegiatan_text_view);
            deskripsiKegiatan = itemView.findViewById(R.id.desc_kegiatan_text_view);
            namaPembuatKegiatan = itemView.findViewById(R.id.name_of_made_by_text_view);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
