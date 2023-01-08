; Declare our namespace
;; (ns core)

;; Strings/Characters/Regular Expressions
(println "My String")

(def my-str-var (str "AB" "C"))

(println my-str-var)
(type my-str-var)

(def my-char \Z)

(println my-char)
(type my-char)

(def my-reg-expr #"Clojure")

(type my-reg-expr)

(re-find my-reg-expr "Clojure is great!")

(re-find my-reg-expr "Scala is great!")



