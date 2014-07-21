## Single page app template

This is a simple project skeleton for single-page webapps written in pure ClojureScript. It contains the integration of the application to a html page and the ability to run unit-tests.

**Installation**
To register it in your local repository install the project: ```lein install```
And than add it your local profiles (```~/lein.profiles.clj```) plugins' section like:
```
{:user
  {:plugins [[single-page/lein-template "0.1.0"]]}}}
```


**Supported commands:**
```
lein cljsbuild once
lein cljsbuild test
```
