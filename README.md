## Single-page ClojureScript application template

This is a simple project skeleton for single-page webapps written in pure ClojureScript. It contains the integration of the application to an HTML page and adds the ability to run unit-tests.

**Installation**
To register it in your local repository install the project with ```lein install``` and then add it your local profiles (```~/lein.profiles.clj```) plugins' section like:
```
{:user
  {:plugins [[single-page/lein-template "0.1.0"]]}}}
```

**Supported commands:**
```
lein cljsbuild once
lein cljsbuild test
```
