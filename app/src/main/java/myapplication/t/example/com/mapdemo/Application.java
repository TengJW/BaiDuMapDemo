package myapplication.t.example.com.mapdemo;


import com.baidu.mapapi.SDKInitializer;

/**
 * Created by T on 2016/9/20.
 */
public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());
    }
}
