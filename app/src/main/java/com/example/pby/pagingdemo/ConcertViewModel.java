package com.example.pby.pagingdemo;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.DataSource;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PagedList;

public class ConcertViewModel extends ViewModel {

    private final LiveData<PagedList<Concert>> convertList;
    private DataSource<Integer, Concert> concertDataSource;

    public ConcertViewModel() {
        ConcertFactory concertFactory = new ConcertFactory();
        concertDataSource = concertFactory.create();
        convertList = new LivePagedListBuilder<>(concertFactory, 20).build();
    }

    public void invalidateDataSource() {
        concertDataSource.invalidate();
    }

    public LiveData<PagedList<Concert>> getConvertList() {
        return convertList;
    }
}
