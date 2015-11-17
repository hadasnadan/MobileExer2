package com.shenkar.shenkarmobileex2;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class RecyclerFragment extends Fragment {

    private RecyclerView RecyclerView;
    private RecyclerAdapter Adapter;
    public RecyclerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_recycler, container, false);
        RecyclerView = (RecyclerView) layout.findViewById(R.id.recyclerList);
        Adapter = new RecyclerAdapter(getActivity(), getData());
        RecyclerView.setAdapter(Adapter);
        RecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false));
        return layout;
    }

    public static List<Data> getData(){
        List <Data> data = new ArrayList<>();
        String[] tasks = {"task 1","task 2", "task 3","task 4", "task 5","task 6","task 7","task 8","task 9","task 10","task 11","task 12","task 13","task 14","task 14","task 15","task 16","task 17","task 18","task 19","task 20"};


        for (int i=0 ; i<tasks.length ; i++ ){
            Data current = new Data();
            current.task = tasks[i];
            data.add(current);
        }
        return data;
    }



}
