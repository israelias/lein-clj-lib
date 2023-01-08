; Declare our namespace
(ns core.core)

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


;; Numbers
(def my-integer 1000)
(type my-integer)

(def my-decimal 10.345633)
(type my-decimal)

(+ my-integer my-decimal)
(type (+ my-integer my-decimal)) ; coerces to java.lang.Double


(def my-ratio 100/8)
(def other-ratio (/ 2 3))
(def whole-number-ratio 10/5)

(type my-ratio) ; clojure.lang.Ratio

(type other-ratio) ; clojure.lang.Ratio

(type whole-number-ratio) ; java.lang.Long

(denominator my-ratio) ; 100/8 becomes 25/2

(ratio? my-ratio)

(double other-ratio) ; use double to evaluate ratio



