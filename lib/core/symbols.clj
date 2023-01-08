;; Symbols

; invoke the function that the "+" symbol refers to
(+ 1 2)

;; Namespaced Symbols

; use fully qualified namespaced symbol
; segment code into different logical groups (modules) 
(clojure.core/+ 1 2)

;; Special Symbols
; three special symbols that actually refer to core types
; "nil" (the null value) and literal "true" and "false"

nil
true
false
