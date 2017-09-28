# VERSION
Link file JAR: <a href="https://github.com/all-my-library/MyLog/tree/master/library/myjar_v1" title="v1">Mylog v1</a>
<br/>
<br/>
<br/>
# HOW TO USE

<h3>Init log with name of the app into application class</h3>
<pre>
@Override
public void onCreate() {
    super.onCreate();

    Logg.init(getString(R.string.app_name), true); // true is allow show log, false to disable show log
}
</pre>
<h3>And use</h3>
<pre>
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Logg.debug(getClass(), "this is debug log");
    Logg.error(getClass(), "this is error log");
    Logg.info(getClass(), "this is info log");
    Logg.verbose(getClass(), "this is verbose log");
}
</pre>
