package version.type.com.version21.common;

import android.app.Activity;

/**
 * Created by susy on 24/06/17.
 */

public class BaseActivity extends Activity {

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("destroy");
    }
}
