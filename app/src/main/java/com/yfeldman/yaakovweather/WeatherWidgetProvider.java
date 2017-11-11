package com.yfeldman.yaakovweather;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.RemoteViews;

import com.android.volley.*;
import com.android.volley.toolbox.Volley;


/**
 * Created by YF on 10/11/2017.
 */

public class WeatherWidgetProvider extends AppWidgetProvider {
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        final int N = appWidgetIds.length;
        // Perform this loop procedure for each App Widget that belongs to this provider
        for (int i=0; i<N; i++) {
            int appWidgetId = appWidgetIds[i];

            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget);

            //RequestQueue queue = Volley.newRequestQueue(this);
            //String url = "http://datapoint.metoffice.gov.uk/public/data/" + BuildConfig.MET_OFFICE_API_KEY;


            appWidgetManager.updateAppWidget(appWidgetId, views);
        }
    }
}
