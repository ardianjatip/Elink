package id.ac.ui.cs.mobileprogramming.ardian.elink.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import id.ac.ui.cs.mobileprogramming.ardian.elink.R;
import id.ac.ui.cs.mobileprogramming.ardian.elink.entity.Event;
import id.ac.ui.cs.mobileprogramming.ardian.elink.ui.home.HomeViewModel;

public class RecycleViewEventAdapter extends RecyclerView.Adapter<RecycleViewEventAdapter.myViewHolder>
{
    ArrayList<Event> eventholder;

    public RecycleViewEventAdapter(ArrayList<Event> eventholder) {
        this.eventholder = eventholder;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.title.setText(eventholder.get(position).getName());
        holder.profile.setText(eventholder.get(position).getName());
        holder.description.setText(eventholder.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return eventholder.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder
    {
        TextView title, profile, description;
        public myViewHolder(@NonNull View itemView)
        {
            super(itemView);
            title = itemView.findViewById(R.id.event_title);
            profile = itemView.findViewById(R.id.event_profile);
            description = itemView.findViewById(R.id.event_description);
        }
    }

}
