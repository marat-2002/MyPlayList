package com.geektech.myplaylist;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.geektech.myplaylist.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements onClick {
    private FragmentSecondBinding fragmentSecondBinding;
    private ArrayList<Music> musics;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentSecondBinding = FragmentSecondBinding.inflate(LayoutInflater.from(getContext()), container,false );
        return fragmentSecondBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        MusicAdapter musicAdapter = new MusicAdapter(musics, this);
        fragmentSecondBinding.recycler.setAdapter(musicAdapter);
    }

    private void loadData() {
        musics = new ArrayList<>();
        musics.add(new Music("Tupac", "Open Fire", "02:40"));
        musics.add(new Music("The neighbourhood", "Softcore", "03:20"));
        musics.add(new Music("Bones", "HDMI", "02:41"));
        musics.add(new Music("Childish Gambino", "Redbone", "02:23"));
        musics.add(new Music("K.Flay", "High Enough", "02:32"));
        musics.add(new Music("Drake", "One dance", "04:22"));
        musics.add(new Music("Ed Sheeran", "Shape of You", "03:53"));
        musics.add(new Music("Bee Gees", "More than a woman", "02:40"));
        musics.add(new Music("Eminem", "Without me", "02:06"));
        musics.add(new Music("Twenty one pilots", "Stressed out", "01:38"));

    }

    @Override
    public void onClick(Music music) {
        Intent playList = new Intent(requireActivity(),SecondActivity.class);
        playList.putExtra("text", music.getSinger());
        playList.putExtra("text_1", music.getMusic());
        startActivity(playList);

    }
}