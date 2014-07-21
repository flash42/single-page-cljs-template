(ns leiningen.new.single-page
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "single-page"))

(defn single-page
  "Create a new single-page cljs app"
  [name]
  (let [data {:name name}]
    (main/info "Generating single-page cljs project..")
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["index.html" (render "index.html" data)]
             ["test/core_test.cljs" (render "core_test.cljs" data)]
             ["src/main.cljs" (render "main.cljs" data)])
    (main/info "Build with eg.: `lein cljsbuild once` than `open index.html`
                or test it with `lein cljsbuild test`")))
