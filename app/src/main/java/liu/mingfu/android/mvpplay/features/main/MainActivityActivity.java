package liu.mingfu.android.mvpplay.features.main;

import android.os.Bundle;

import com.cestbon.android.lib_network.di.module.NetWorkModule;
import com.cestbon.android.lib_network.di.component.DaggerNetWorkComponent;
import com.cestbon.android.lib_resource.mvp.BaseActivity;
import com.cestbon.android.lib_basic.di.component.AppComponent;

import liu.mingfu.android.mvpplay.di.component.DaggerMainActivityComponent;
import liu.mingfu.android.mvpplay.di.module.MainActivityModule;
import liu.mingfu.android.mvpplay.features.main.MainActivityContract;
import liu.mingfu.android.mvpplay.features.main.MainActivityPresenter;

import liu.mingfu.android.mvpplay.R;


import static com.cestbon.android.lib_basic.utils.Preconditions.checkNotNull;


public class MainActivityActivity extends BaseActivity<MainActivityPresenter> implements MainActivityContract.View {


    @Override
    public void setupActivityComponent(AppComponent appComponent) {
        DaggerMainActivityComponent //如找不到该类,请编译一下项目
                .builder()
                .netWorkComponent(DaggerNetWorkComponent.builder().appComponent(appComponent).netWorkModule(new NetWorkModule()).build())
                .mainActivityModule(new MainActivityModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(Bundle savedInstanceState) {
        return R.layout.activity_main; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }

}
