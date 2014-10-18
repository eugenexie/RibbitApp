package company.eugene.ribbit;

import android.app.Application;
import com.parse.Parse;

/**
 * Created by Eugene on 17/10/2014.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "hgLS45oXDh0tlz6a0AoGH2g9A771t3CUz2H6hiQP", "sZqr5hfoGbP8hlkynO5qr8z5Qs5VuHWpjcnHQXxD");
    }



}
