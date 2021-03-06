(ns clojure-sig-question-2015-10-07.core)

; working (original) version
(defn add-item-1 [collection item stack-key]
  (let [
    current-stack (collection stack-key)]
  (merge collection {stack-key (if current-stack
    (conj current-stack item)
    [item])})) )

; experimental version using update-in
(defn add-item-upd [collection item stack-key]
  (update-in collection [stack-key]
    (fn [current-stack] (if current-stack
      (conj current-stack item)
      [item]))) )

; second version with more idiomatic use of conj
(defn add-item-upd-2 [collection item stack-key]
  (update-in collection [stack-key] conj item) )

; current binding under test
(def add-item  add-item-upd-2)

