(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2234"]
                 [com.cemerick/clojurescript.test "0.3.1"]]
  :hooks [leiningen.cljsbuild]
  :plugins [[lein-cljsbuild "1.0.3"]
            [com.cemerick/clojurescript.test "0.3.1"]]
  
  :cljsbuild
  {:builds
   {:test {:source-paths ["src" "test"]
           :incremental? true
           :compiler {:output-to "out/main.js"
                      :optimizations :whitespace
                      :pretty-print true}}}
   :test-commands {"unit" ["phantomjs" :runner
                           "out/main.js"]}})