package liu.mingfu.android.mvpplay.features.main;

import com.cestbon.android.lib_network.provider.BaseNetWorkModel;
import com.cestbon.android.lib_network.provider.SynchronizationHelper;

import com.cestbon.android.lib_basic.di.scope.ActivityScope;

import javax.inject.Inject;

import liu.mingfu.android.mvpplay.features.main.MainActivityContract;


@ActivityScope
public class MainActivityModel extends BaseNetWorkModel implements MainActivityContract.Model {

    @Inject
    public MainActivityModel(SynchronizationHelper synchronizationHelper) {
        super(synchronizationHelper);
    }

}