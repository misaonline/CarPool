package com.misa.pool;

import java.lang.reflect.Field;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;

import com.misa.pool.dom.BaseForm;


public abstract class BaseAction extends Activity
{
    private LayoutInflater mLayoutInflater = null;
    private BaseApplication mApplication = null;
    
    public void onCreate(Bundle savedInstanceState)
    {
    	//����ʾtitle
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        
        onBeforeCreate(savedInstanceState);
        
        super.onCreate(savedInstanceState);
        
        //���������ļ�  ���벻ͬ����ҳ�� xml��Դ������
        onCreateContent(savedInstanceState);
        
        //ҵ����
        installBusiness();
        
        // ��ʼ����Ϊ
        installAction();
        
        //xml ��  Դ������ҳ�� ������Ϊ
        dispatchListener();
    }
    
    //����֮ǰ����
    public void onBeforeCreate(Bundle savedInstanceState)
    {
    	mApplication = (BaseApplication)getApplication();
        //mApplication.addScreenPage(this);
        
        mLayoutInflater = getLayoutInflater();
    }
    
    public LayoutInflater getBaseInflater()
    {
    	if(mLayoutInflater == null)
    	{
    		mLayoutInflater = getLayoutInflater();
    	}
    	return mLayoutInflater;
    }
    
    public BaseApplication getBaseApplication()
    {
    	return mApplication;
    }
    
    //ʵ��������
    public void onCreateContent(Bundle savedInstanceState)
    {
    	installUiFromXML();
    }
    
    //��ת����һ��Action
    public void dropToNextAction(Class targetAction,BaseForm params)
    {
        Intent dropIntent = new Intent();
        
        if(params != null)
        {
            Bundle bundle = new Bundle();
            bundle.putSerializable("params", params);
            dropIntent.putExtras(bundle);
        }
        
        dropIntent.setClass(this, targetAction);
        startActivity(dropIntent);
    }
    
    
    private void installUiFromXML()
    {
        try
        {
         
            PackageManager pManager = this.getPackageManager();
            PackageInfo info = pManager.getPackageInfo(this.getPackageName(), 0);
            String pName = info.packageName;
            Class<?> cs = Class.forName(pName + ".R$layout");
            
            String XMLName = this.getClass().getName().toLowerCase();
            XMLName = XMLName.substring(XMLName.lastIndexOf(".") + 1).replace("action", "");
            Field field = cs.getDeclaredField(XMLName);

            setContentView(field.getInt(null));
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public abstract void installBusiness();
    
    /**
     * ��ʼ����Ϊ
     * */
    public abstract void installAction();
    
    /**
     * xml �� Դ������ ������Ϊ
     * */
    public abstract void dispatchListener();
        
}
