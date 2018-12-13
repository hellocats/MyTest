package com.he.mytest.common;

import com.alibaba.android.arouter.launcher.ARouter;
import com.he.mytest.R;
import com.he.mytest.base.BaseActivity;
import com.he.mytest.route.RouteUtils;

import butterknife.OnClick;

public class LoginFlashActivity extends BaseActivity {

	@Override
	protected int setActivityLayout() {
		return R.layout.activity_login_flash;
	}

	@Override
	protected void firstInitialize() {

	}

	@OnClick(R.id.flash_btn_load)
	public void onClick() {
		ARouter.getInstance().build(RouteUtils.App_Login).navigation();
	}
}
