(ns clojure-sig-question-2015-10-07.core)

(defn add-item [collection item stack-key]
  (let [
    current-stack (collection stack-key)]
  (merge collection {stack-key (if current-stack
    (conj current-stack item)
    [item])})) )
