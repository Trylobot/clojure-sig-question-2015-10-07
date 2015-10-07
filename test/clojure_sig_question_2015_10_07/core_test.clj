(ns clojure-sig-question-2015-10-07.core-test
  (:require [clojure.test :refer :all]
            [clojure-sig-question-2015-10-07.core :refer :all]))

(deftest add-item-test
  (testing "add-item to empty collection"
    (is (= 
        {:a [1]} 
        (add-item {} 1 :a) )))
  (testing "add-item to non-empty collection, non-existing key"
    (is (=
        {:a [], :b [1]}
        (add-item {:a []} 1 :b) )))
  (testing "add-item to non-empty collection, existing key, empty stack"
    (is (= 
        {:a [1]}
        (add-item {:a []} 1 :a) ))) 
  (testing "add-item to non-empty collection, existing key, non-empty stack"
    (is (=
        {:a [1 2]}
        (add-item {:a [1]} 2 :a) )))
)
