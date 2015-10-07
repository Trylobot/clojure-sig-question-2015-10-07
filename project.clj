(defproject clojure-sig-question-2015-10-07 
    "0.1.0-SNAPSHOT"
    :description "Clojure SIG question 2015-10-07"
    :dependencies [
        [org.clojure/clojure "1.8.0-alpha5"]
        [com.rpl/specter "0.7.1"]]
    :profiles {
        :uberjar {:aot :all}
        :dev {:plugins [[lein-autoreload "0.1.0"]]}} )
