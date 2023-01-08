(ns app.core
  (:require [cheshire.core :as cheshire])
  (:gen-class))

(defn -main
  "About to know a whole lot."
  [& args]
  (println "About these args?:" args)
  (println (cheshire/generate-string {:name "Elias" :size "venti"}))
  )
