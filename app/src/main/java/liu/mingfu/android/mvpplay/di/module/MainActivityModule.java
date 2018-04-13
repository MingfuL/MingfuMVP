package liu.mingfu.android.mvpplay.di.module;

import com.cestbon.android.lib_basic.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import liu.mingfu.android.mvpplay.features.main.MainActivityContract;
import liu.mingfu.android.mvpplay.features.main.MainActivityModel;


@Module
public class MainActivityModule {
    private MainActivityContract.View view;

    /**
     * 构建MainActivityModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public MainActivityModule(MainActivityContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    MainActivityContract.View provideMainActivityView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    MainActivityContract.Model provideMainActivityModel(MainActivityModel model) {
        return model;
    }
}