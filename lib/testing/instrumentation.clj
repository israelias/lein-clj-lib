;; Instrumentation
(ns testing.instrumentation
  (:require [clojure.test :refer :all]))

; Define a function
(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

; Select then press "ctrl+alt+c i"

; Hit the first breakpoint

(a-test)