package liu.mingfu.android.mvpplay.features.main;

import android.app.Application;

import com.cestbon.android.lib_basic.di.scope.ActivityScope;
import com.cestbon.android.lib_resource.mvp.BasePresenter;

import javax.inject.Inject;

import liu.mingfu.android.mvpplay.features.main.MainActivityContract;


@ActivityScope
public class MainActivityPresenter extends BasePresenter<MainActivityContract.View, MainActivityContract.Model> {

    @Inject
    public MainActivityPresenter(MainActivityContract.View rootView, MainActivityContract.Model model) {
        super(rootView, model);

    }


}
