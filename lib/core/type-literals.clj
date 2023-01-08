;; String Literals

; string literal
(def hello "Hello World")

; character literal 
(def z-char \Z)

; regular expression that checks for all cap letters
(def my-regexp #"[A-Z]")

;; Numeric Literals

; integer
(def hundred 100)

; floating point literal
(def my-floating-point 100.12345)

; ratio where the result is not actually stored
(def my-ratio 10/7)

; a core, numeric function that returns the integer 10 
; ie the numerator of the given ratio
(numerator my-ratio)