package id.ac.ui.cs.mobileprogramming.ardian.elink.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.ac.ui.cs.mobileprogramming.ardian.elink.adapter.RecycleViewEventAdapter;
import id.ac.ui.cs.mobileprogramming.ardian.elink.entity.Event;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import id.ac.ui.cs.mobileprogramming.ardian.elink.R;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter eventAdapter;
    RecyclerView.LayoutManager layoutManager;
    String[] eventList = {"futsal", "party", "birthday bash"};
    String[] eventDescriptionList = {"futsal bareng temen SMA", "party di bar", "birthday si roni"};
    String[] eventTime = {"sunday","tuesday", "friday"};

    private String mParam1;
    private String mParam2;
    ArrayList<Event> eventHolder;

    private HomeViewModel homeViewModel;

    private View mainView;

    public static HomeFragment newInstance(String param1, String param2){
        HomeFragment homeFragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString("param1", param1);
        args.putString("param2", param2);
        homeFragment.setArguments(args);
        return homeFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null){
            mParam1 = getArguments().getString("param1");
            mParam2 = getArguments().getString("param2");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup containerObject, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_home, containerObject, false);
        recyclerView = view.findViewById(R.id.home_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        eventHolder = new ArrayList<>();

//        Event obj1 = new Event();
//        eventHolder.add(obj1);
//        eventHolder.add(obj1);
//        eventHolder.add(obj1);
//        eventHolder.add(obj1);
//        eventHolder.add(obj1);

        recyclerView.setAdapter(new RecycleViewEventAdapter(eventHolder));

        return view;
    }

    private void setViewLayout(int id){
        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mainView = inflater.inflate(id, null);
        ViewGroup rootView = (ViewGroup) getView();
        rootView.removeAllViews();
        rootView.addView(mainView);
    }
}