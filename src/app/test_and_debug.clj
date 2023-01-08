(ns app.test-and-debug)

(defn last-four
  [serial-num]
  (subs (str serial-num) (- (.length (str serial-num)) 4)))
