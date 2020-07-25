package com.Romanizer.wakeme.async;


import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;

import com.Romanizer.wakeme.adapter.AsyncResponse;

public class JRequest extends AsyncTask<Void, Void, String>{

    public JRequest(AsyncResponse delegate, Context c){
        this.delegate = delegate;
        this.c = c;
    }

    @SuppressLint("StaticFieldLeak")
    private Context c;
    private AsyncResponse delegate = null;

    @Override
    protected String doInBackground(Void... voids) {

        //TODO stuff
        return null;
    }

    protected void onPostExecute(String p){
        delegate.processFinish(p);
    }

}
