package com.misa.pool;

import android.os.Handler;
import android.os.Message;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class SplashAction extends BaseAction 
{
	private ImageView mImageView = null;
	private Animation mAnimation = null;
	Handler mHandler = null;
	
	@Override
	public void installBusiness() 
	{
		mImageView = (ImageView)findViewById(R.id.splash_item);
		
		mAnimation = AnimationUtils.loadAnimation(this, R.anim.loading);
		
		mHandler = new Handler()
		{
			public void handleMessage(Message message)
			{
				switch(message.what)
				{
				case 0:
					break;
				}
			}
		};
		
		new Thread(){
			public void run()
			{
				//
				mHandler.sendEmptyMessage(0);
			}
		}.start();
	}

	@Override
	public void installAction() 
	{
		mImageView.setAnimation(mAnimation);
	}

	@Override
	public void dispatchListener() 
	{
		mAnimation.setAnimationListener(new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) 
			{
				//初始化资源
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) 
			{
				
			}
			
			@Override
			public void onAnimationEnd(Animation animation) 
			{
				SplashAction.this.dropToNextAction(MainAction.class, null);
				SplashAction.this.finish();
			}
		});
	}

}
