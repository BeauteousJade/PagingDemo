package com.example.pby.pagingdemo;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.DataSource;

public class ConcertFactory extends DataSource.Factory<Integer, Concert> {

    private MutableLiveData<ConcertDataSource> mSourceLiveData =
            new MutableLiveData<>();

    @Override
    public DataSource<Integer, Concert> create() {
        ConcertDataSource concertDataSource = new ConcertDataSource();
        mSourceLiveData.postValue(concertDataSource);
        return concertDataSource;
    }
}
