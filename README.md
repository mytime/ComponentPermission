# ComponentPermission
为基本组件添加权限控制

1：在应用1中，新建一个Activity: MayAty,
  
2： Androidmanifest中声明权限
  <!--声明一个权限-->
    <permission android:name="com.hello.componentpermission.permission.MyAty" />

3：<!--为这个Activity添加使用权限-->
        <activity
            android:name=".MyAty"
            android:label="MyAty"
            android:permission="com.hello.componentpermission.permission.MyAty"
            >
            <!--//action:应用程序外部调用方法-->
            <intent-filter>
                <action android:name="com.hello.componentpermission.intent.action.MyAty"/>
            </intent-filter>
        </activity>
        
4：在应用2的AndroidManifest中添加访问应用1 中Activity的权限
  <!--添加启动另外一个应用的Activity的权限-->
    <uses-permission android:name="com.hello.componentpermission.intent.action.MyAty"/>
