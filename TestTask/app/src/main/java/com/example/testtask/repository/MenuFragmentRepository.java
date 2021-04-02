package com.example.testtask.repository;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.example.testtask.R;
import com.example.testtask.models.GalleryModel;
import com.example.testtask.models.PlayerModel;
import com.example.testtask.ui.menu.MenuFragment;

import java.util.ArrayList;
import java.util.List;

public class MenuFragmentRepository {
    private Application application;
    private List<PlayerModel> players;
    private List<GalleryModel> gallery;
    private static boolean playerFlag = false;
    private PlayerAdapter playerAdapter;
    private GalleryAdapter galleryAdapter;
    private static MutableLiveData<PlayerAdapter> playerAdapterMutableLiveData;
    private static MutableLiveData<GalleryAdapter> galleryAdapterMutableLiveData;
    private static MutableLiveData<Integer> rulesMutableLiveData;

    public MenuFragmentRepository(Application application) {
        this.application = application;
        players = new ArrayList<>();
        gallery = new ArrayList<>();
        playerAdapterMutableLiveData = new MutableLiveData<>();
        galleryAdapterMutableLiveData = new MutableLiveData<>();
        rulesMutableLiveData = new MutableLiveData<>();
    }

    public void itsFootball() {
        players.clear();
        gallery.clear();

        players.add(new PlayerModel(R.drawable.football_player_avatar, "Лионель Месси", "Футбол"));
        players.add(new PlayerModel(R.drawable.football_player_avatar, "Криштиану Роналду", "Футбол"));
        players.add(new PlayerModel(R.drawable.football_player_avatar, "Лионель Месси", "Футбол"));
        players.add(new PlayerModel(R.drawable.football_player_avatar, "Криштиану Роналду", "Футбол"));
        players.add(new PlayerModel(R.drawable.football_player_avatar, "Лионель Месси", "Футбол"));
        players.add(new PlayerModel(R.drawable.football_player_avatar, "Криштиану Роналду", "Футбол"));
        players.add(new PlayerModel(R.drawable.football_player_avatar, "Лионель Месси", "Футбол"));
        players.add(new PlayerModel(R.drawable.football_player_avatar, "Криштиану Роналду", "Футбол"));
        players.add(new PlayerModel(R.drawable.football_player_avatar, "Лионель Месси", "Футбол"));
        players.add(new PlayerModel(R.drawable.football_player_avatar, "Криштиану Роналду", "Футбол"));
        players.add(new PlayerModel(R.drawable.football_player_avatar, "Лионель Месси", "Футбол"));
        players.add(new PlayerModel(R.drawable.football_player_avatar, "Криштиану Роналду", "Футбол"));
        players.add(new PlayerModel(R.drawable.football_player_avatar, "Лионель Месси", "Футбол"));
        players.add(new PlayerModel(R.drawable.football_player_avatar, "Криштиану Роналду", "Футбол"));
        players.add(new PlayerModel(R.drawable.football_player_avatar, "Лионель Месси", "Футбол"));
        for (int i = 0; i < 15; i++) {
            gallery.add(new GalleryModel(R.drawable.football_gallery));
        }

        galleryAdapter = new GalleryAdapter(gallery);
        playerAdapter = new PlayerAdapter(players);
        playerAdapterMutableLiveData.setValue(playerAdapter);
        galleryAdapterMutableLiveData.setValue(galleryAdapter);
        rulesMutableLiveData.setValue(R.string.rules_football);
    }

    public void itsBasketball() {
        players.clear();
        gallery.clear();

        players.add(new PlayerModel(R.drawable.basketball_player, "Майкл Джордан", "Баскетбол"));
        players.add(new PlayerModel(R.drawable.basketball_player, "Леброн Джеймс", "Баскетбол"));
        players.add(new PlayerModel(R.drawable.basketball_player, "Майкл Джордан", "Баскетбол"));
        players.add(new PlayerModel(R.drawable.basketball_player, "Леброн Джеймс", "Баскетбол"));
        players.add(new PlayerModel(R.drawable.basketball_player, "Майкл Джордан", "Баскетбол"));
        players.add(new PlayerModel(R.drawable.basketball_player, "Леброн Джеймс", "Баскетбол"));
        players.add(new PlayerModel(R.drawable.basketball_player, "Майкл Джордан", "Баскетбол"));
        players.add(new PlayerModel(R.drawable.basketball_player, "Леброн Джеймс", "Баскетбол"));
        players.add(new PlayerModel(R.drawable.basketball_player, "Майкл Джордан", "Баскетбол"));
        players.add(new PlayerModel(R.drawable.basketball_player, "Леброн Джеймс", "Баскетбол"));
        players.add(new PlayerModel(R.drawable.basketball_player, "Майкл Джордан", "Баскетбол"));
        players.add(new PlayerModel(R.drawable.basketball_player, "Леброн Джеймс", "Баскетбол"));
        players.add(new PlayerModel(R.drawable.basketball_player, "Майкл Джордан", "Баскетбол"));
        players.add(new PlayerModel(R.drawable.basketball_player, "Леброн Джеймс", "Баскетбол"));
        players.add(new PlayerModel(R.drawable.basketball_player, "Майкл Джордан", "Баскетбол"));

        for (int i = 0; i < 15; i++) {
            gallery.add(new GalleryModel(R.drawable.basketball_gallery));
        }

        galleryAdapter = new GalleryAdapter(gallery);
        playerAdapter = new PlayerAdapter(players);
        playerAdapterMutableLiveData.setValue(playerAdapter);
        galleryAdapterMutableLiveData.setValue(galleryAdapter);
        rulesMutableLiveData.setValue(R.string.rules_basketball);
    }

    public void itsTennis() {
        players.clear();
        gallery.clear();

        players.add(new PlayerModel(R.drawable.tennis_player_avatar, "Роджер Федерер", "Тенис"));
        players.add(new PlayerModel(R.drawable.tennis_player_avatar, "Рафаэль Надаль", "Тенис"));
        players.add(new PlayerModel(R.drawable.tennis_player_avatar, "Роджер Федерер", "Тенис"));
        players.add(new PlayerModel(R.drawable.tennis_player_avatar, "Рафаэль Надаль", "Тенис"));
        players.add(new PlayerModel(R.drawable.tennis_player_avatar, "Роджер Федерер", "Тенис"));
        players.add(new PlayerModel(R.drawable.tennis_player_avatar, "Рафаэль Надаль", "Тенис"));
        players.add(new PlayerModel(R.drawable.tennis_player_avatar, "Роджер Федерер", "Тенис"));
        players.add(new PlayerModel(R.drawable.tennis_player_avatar, "Рафаэль Надаль", "Тенис"));
        players.add(new PlayerModel(R.drawable.tennis_player_avatar, "Роджер Федерер", "Тенис"));
        players.add(new PlayerModel(R.drawable.tennis_player_avatar, "Рафаэль Надаль", "Тенис"));
        players.add(new PlayerModel(R.drawable.tennis_player_avatar, "Роджер Федерер", "Тенис"));
        players.add(new PlayerModel(R.drawable.tennis_player_avatar, "Рафаэль Надаль", "Тенис"));
        players.add(new PlayerModel(R.drawable.tennis_player_avatar, "Роджер Федерер", "Тенис"));
        players.add(new PlayerModel(R.drawable.tennis_player_avatar, "Рафаэль Надаль", "Тенис"));
        players.add(new PlayerModel(R.drawable.tennis_player_avatar, "Роджер Федерер", "Тенис"));

        for (int i = 0; i < 15; i++) {
            gallery.add(new GalleryModel(R.drawable.tennis_gallery));
        }

        galleryAdapter = new GalleryAdapter(gallery);
        playerAdapter = new PlayerAdapter(players);
        playerAdapterMutableLiveData.setValue(playerAdapter);
        galleryAdapterMutableLiveData.setValue(galleryAdapter);
        rulesMutableLiveData.setValue(R.string.rules_tennis);
    }

    public void itsHandball() {
        players.clear();
        gallery.clear();

        players.add(new PlayerModel(R.drawable.handball_player_avatar, "Сандер Сагосен", "Гандбол"));
        players.add(new PlayerModel(R.drawable.handball_player_avatar, "Давид Балагер", "Гандбол"));
        players.add(new PlayerModel(R.drawable.handball_player_avatar, "Сандер Сагосен", "Гандбол"));
        players.add(new PlayerModel(R.drawable.handball_player_avatar, "Давид Балагер", "Гандбол"));
        players.add(new PlayerModel(R.drawable.handball_player_avatar, "Сандер Сагосен", "Гандбол"));
        players.add(new PlayerModel(R.drawable.handball_player_avatar, "Давид Балагер", "Гандбол"));
        players.add(new PlayerModel(R.drawable.handball_player_avatar, "Сандер Сагосен", "Гандбол"));
        players.add(new PlayerModel(R.drawable.handball_player_avatar, "Давид Балагер", "Гандбол"));
        players.add(new PlayerModel(R.drawable.handball_player_avatar, "Сандер Сагосен", "Гандбол"));
        players.add(new PlayerModel(R.drawable.handball_player_avatar, "Давид Балагер", "Гандбол"));
        players.add(new PlayerModel(R.drawable.handball_player_avatar, "Сандер Сагосен", "Гандбол"));
        players.add(new PlayerModel(R.drawable.handball_player_avatar, "Давид Балагер", "Гандбол"));
        players.add(new PlayerModel(R.drawable.handball_player_avatar, "Сандер Сагосен", "Гандбол"));
        players.add(new PlayerModel(R.drawable.handball_player_avatar, "Давид Балагер", "Гандбол"));
        players.add(new PlayerModel(R.drawable.handball_player_avatar, "Сандер Сагосен", "Гандбол"));

        for (int i = 0; i < 15; i++) {
            gallery.add(new GalleryModel(R.drawable.handball_gallery));
        }

        galleryAdapter = new GalleryAdapter(gallery);
        playerAdapter = new PlayerAdapter(players);
        playerAdapterMutableLiveData.setValue(playerAdapter);
        galleryAdapterMutableLiveData.setValue(galleryAdapter);
        rulesMutableLiveData.setValue(R.string.rules_handball);
    }

    public static MutableLiveData<PlayerAdapter> getPlayerAdapterMutableLiveData() {
        return playerAdapterMutableLiveData;
    }

    public static MutableLiveData<GalleryAdapter> getGalleryAdapterMutableLiveData() {
        return galleryAdapterMutableLiveData;
    }

    public static MutableLiveData<Integer> getRulesMutableLiveData() {
        return rulesMutableLiveData;
    }
}
