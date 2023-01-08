(ns app.test-and-debug-test
  (:require [clojure.test :refer :all]
            [app.test-and-debug :refer :all]))

(deftest last-four-test
  (testing "Failed to extract last four of serial number."
    (is (= (last-four 12345678) "5678"))))