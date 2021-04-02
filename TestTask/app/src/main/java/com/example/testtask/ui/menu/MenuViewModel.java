package com.example.testtask.ui.menu;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.testtask.repository.GalleryAdapter;
import com.example.testtask.repository.MenuFragmentRepository;
import com.example.testtask.repository.PlayerAdapter;

public class MenuViewModel extends AndroidViewModel {
    private MenuFragmentRepository repository;

    public MenuViewModel(@NonNull Application application) {
        super(application);
        this.repository = new MenuFragmentRepository(application);
    }

    public void itsFootball(){
        repository.itsFootball();
    }
    public void itsBasketball(){
        repository.itsBasketball();
    }
    public void itsTennis(){
        repository.itsTennis();
    }
    public void itsHandball(){
        repository.itsHandball();
    }

    public MutableLiveData<PlayerAdapter> getPlayerAdapterMutableLiveData() {
        return repository.getPlayerAdapterMutableLiveData();
    }

    public MutableLiveData<GalleryAdapter> getGalleryAdapterMutableLiveData() {
        return repository.getGalleryAdapterMutableLiveData();
    }

    public MutableLiveData<Integer> getRulesMutableLiveData() {
        return repository.getRulesMutableLiveData();
    }
}