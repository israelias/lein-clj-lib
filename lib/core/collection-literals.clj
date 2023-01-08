;;; Collection Literals


;; Sequential (Ordered collection of elements)

;; Vectors 
;; indexed, new elems are added at end
(def my-vector [1 2 3])
(get my-vector 0)


;; Lists
;; not indexed, implemented by linked-list data structure
;; must walk the list to extract data you want
;; back tick tells compiler not to evaluate this as function
;; since these are all technically lists
;; this is a literal list, don't evaluate

;; Lists are evaluated by invoking the first element as a function
;; you must quote a list to prevent this and make it a literal first

;; without the backtic this would call the function 1 with params 2 and 3
(def my-list `(1 2 3))
(first my-list)

;; Hashed (Unordered collection of elements)

;; Sets
;; created with curlies preceded by #
;; unordered, no duplicates

#{"Zachary", "Kalie", "James"}
; ? convention to return boolean
(contains? #{"Zachary" "Kalie"} "Kalie")


;; Maps
;; key/value pairs in curlies
;; commas are optional, treated as whitespace 
;; colon is key word used as keys in maps
;; used everywhere!
{:Zachary 1, :Kalie 8, :James 10}
{:Zachary 1 :Kalie 8 :James 10}
; add new element to a map
; immutable, a new map will be returned
(assoc {:Zachary 1} :Brian 12)