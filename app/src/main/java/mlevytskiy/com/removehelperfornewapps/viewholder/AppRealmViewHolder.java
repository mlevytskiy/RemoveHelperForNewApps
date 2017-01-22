package mlevytskiy.com.removehelperfornewapps.viewholder;

import android.support.annotation.LayoutRes;
import android.view.ViewGroup;

import mlevytskiy.com.removehelperfornewapps.realmObject.App;

/**
 * Created by max on 22.01.17.
 */

public class AppRealmViewHolder extends AnyRealmViewHolder<App> {

    public AppRealmViewHolder(ViewGroup parent, @LayoutRes int layout) {
        super(parent, layout);
    }

    @Override
    public void bind(App item) {

    }
}
