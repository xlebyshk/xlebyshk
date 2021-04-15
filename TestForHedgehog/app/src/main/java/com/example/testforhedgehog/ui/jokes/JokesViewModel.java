package com.example.testforhedgehog.ui.jokes;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.testforhedgehog.model.JokeForList;
import com.example.testforhedgehog.model.JokeNetworkModel;
import com.example.testforhedgehog.model.JokesNetworkModel;
import com.example.testforhedgehog.repository.NetworkService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class JokesViewModel extends ViewModel {
    private static final String TAG = "HomeViewModel";
    private final List<JokeForList> jokesForList = new ArrayList<>();
    private MutableLiveData<List<JokeForList>> jokeForListData;

    public JokesViewModel() {
        jokeForListData = new MutableLiveData<>();
    }

    public void receiveJokes(int count) {
        NetworkService.getInstance().getApi().getJokes(count).enqueue(new Callback<JokesNetworkModel>() {
            @Override
            public void onResponse(Call<JokesNetworkModel> call, Response<JokesNetworkModel> response) {
                jokesForList.clear();
                for (JokeNetworkModel jokes : response.body().jokes) {
                    jokesForList.add(new JokeForList(jokes.joke));
                }
                jokeForListData.postValue(jokesForList);
            }

            @Override
            public void onFailure(Call<JokesNetworkModel> call, Throwable t) {
            }
        });
    }

    public LiveData<List<JokeForList>> getJoke() {
        return jokeForListData;
    }
}