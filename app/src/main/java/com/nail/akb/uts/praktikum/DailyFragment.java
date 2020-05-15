package com.nail.akb.uts.praktikum;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DailyFragment extends Fragment {

    /*
    tanggal :09-05-2020
    nim :10117138
    nama :Ilham Nurjaman
    kelas :IF4/AKB
     */

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_daily, container, false);
    return view;
}
}