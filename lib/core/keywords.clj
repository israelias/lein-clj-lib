;; Keywords
;; Special symbols that always refer to themselves

; prefaced by colon
:foobar
; namespaced keyword uses two colons, 
; which is scoped to the namespace you're currently programming within 
::foobar

; Keywords are used with maps
; they're like lightweight constant strings
(def my-map {:Zach 1 :Kalie 2})

; they can look themselves up in maps
(get my-map :Kalie)

; instead of being forced to use the get function
(:Kalie my-map)