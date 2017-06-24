package version.type.com.version21.modules;

import android.support.multidex.MultiDex;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import version.type.com.version21.R;
import version.type.com.version21.common.BaseActivity;

public class Main extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MultiDex.install(this);

    }
}
