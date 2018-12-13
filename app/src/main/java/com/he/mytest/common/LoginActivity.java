package com.he.mytest.common;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.he.mytest.R;
import com.he.mytest.base.BaseActivity;
import com.he.mytest.route.RouteUtils;

import butterknife.OnClick;

/**
 * Author:hepeng
 * Date:2018-12-13
 * Description:
 */
@Route(path = RouteUtils.App_Login)
public class LoginActivity extends BaseActivity {

	@Override
	protected int setActivityLayout() {
		return R.layout.activity_login;
	}

	@Override
	protected void firstInitialize() {

	}

	@OnClick(R.id.login_btn_login)
	public void onClick() {
		ARouter.getInstance().build(RouteUtils.App_Main).navigation();
	}
}
