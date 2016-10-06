# SuiteventBase
Suitevent base using Retrofit 2, Realm, Dagger

Step 1. Add it in your root build.gradle at the end of repositories:
```
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```
  
Step 2. Add the dependency
```
dependencies {
    compile 'com.github.AldiFirando:SuiteventBase:0.0.1'
}
```

Note:

1. Add this in depedencies in project gradle
```
dependencies {
    ...
    classpath 'me.tatarka:gradle-retrolambda:3.2.5'
    classpath 'me.tatarka.retrolambda.projectlombok:lombok.ast:0.2.3.a2'
    classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
}
```

2. Apply plugin in Module app
```
apply plugin: 'com.neenbedankt.android-apt'
```
