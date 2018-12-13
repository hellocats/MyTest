package com.he.mytest.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.ButterKnife;

/**
 * Author:hepeng
 * Date:2018-12-12
 * Description:
 */

public abstract class BaseActivity extends AppCompatActivity {
	protected AppCompatActivity activity;
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		activity = this;
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		ARouter.getInstance().inject(this);
		getWindow().setSoftInputMode(   WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
		setContentView(setActivityLayout());
		ButterKnife.bind(this);
		firstInitialize();
	}


	//设置Activity根布局
	protected abstract int setActivityLayout();

	//初始化数据（在activity创建之前）
	protected abstract void firstInitialize();

}
