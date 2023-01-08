(defproject app "0.1.0-SNAPSHOT"
  :description "Environment to run Clojure with Java/Scala in a mono Leiningen repo"
  :url "https://github.com/israelias/lein-clj-lib"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [
                 [org.clojure/clojure "1.11.1"]
                 [cheshire "5.11.0"]
                 ]
  :main ^:skip-aot app.core
  :target-path "target/%s" 
  :repl-options {:init-ns app.test-and-debug}
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}}) 
