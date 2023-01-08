(ns app.core
  (:require [cheshire.core :as cheshire]
            [app.test-and-debug :as debug])
  (:gen-class))

(defn -main
  "About to know a whole lot."
  [& args]
  (println "About these args?:" args)
  (println (debug/last-four 12345678))
  (println (cheshire/generate-string {:name "Elias" :size "venti"}))
  )
