package liu.mingfu.android.mvpplay.di.component;

import com.cestbon.android.lib_basic.di.scope.ActivityScope;
import com.cestbon.android.lib_network.di.component.NetWorkComponent;

import dagger.Component;

import liu.mingfu.android.mvpplay.di.module.MainActivityModule;

import liu.mingfu.android.mvpplay.features.main.MainActivityActivity;

@ActivityScope
@Component(modules = MainActivityModule.class, dependencies = NetWorkComponent.class)
public interface MainActivityComponent {
    void inject(MainActivityActivity activity);
}