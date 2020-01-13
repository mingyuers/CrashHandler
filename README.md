# CrashHandler
 [ ![Download](https://api.bintray.com/packages/tzl/CrashHandler/CrashHandler/images/download.svg?version=1.0.1) ](https://bintray.com/tzl/CrashHandler/CrashHandler/1.0.1/link)
 
## Features:

## Usage
### Step1
##### Add dependencies in build.gradle.

    dependencies {  
    　　compile 'com.fangm:crashhandler:1.0.2'
    }
###### Or Maven:

    <dependency>
      <groupId>com.fangm</groupId>
      <artifactId>crashhandler</artifactId>
      <version>1.0.2</version>
      <type>pom</type>
    </dependency>
    
### Step2
init CrashHandler in your Application as :

    CrashHandler.init(new CrashHandler.Builder(this));

or custom your CrashLogService and init by this :

    CrashHandler.init(new CrashHandler.Builder(this)
                .setCrashLogService(new CrashLogServiceImpl())
                .setCrashTips("自定义提示信息")
                .build()
    );

you can custom your crashlog by implements ICrashLogService

```
public interface ICrashLogService {
    void saveCrashLog(String log);
}
```

### Contact me
If you have a better idea , please let me know , thanks ~

Email : fangangmin@gmail.com

