;; Composing Test

(ns testing.unit-tests
  (:require [clojure.test :refer :all]))

(deftest division
  (testing "dividing one by one."
    (is (= (/ 1 1) 1))))

(deftest multiplication
  (testing "multiplying one times one."
    (is (= (* 1 1) 1))))

(deftest math-works
  (division)
  (multiplication))