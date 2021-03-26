package com.moju.mojunews;

import android.content.Context;
import android.util.Log;

import androidx.loader.content.AsyncTaskLoader;

import java.util.List;

import android.content.ContentValues;



public class NewsLoader extends AsyncTaskLoader<List<News>> {
    private String mUrl;

    public NewsLoader(Context context, String url) {
        super(context);
        Log.i(ContentValues.TAG, "NewsLoader: "+ url);
        mUrl = url;
    }

    @Override
    public List<News> loadInBackground() {
        if(mUrl == null) return null;

        List<News> newsList = QueryTools.fetchNewsData(mUrl);
        return newsList;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }
}