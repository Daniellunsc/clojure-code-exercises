(ns maxdifflength.core-test
  (:require [clojure.test :refer :all]
            [codewars.maximum-length-difference.core :refer :all]))

(defn test-assert [act exp]
  (is (= act exp)))

(deftest a-test1
  (testing "mxdiflg"
    (def s1 ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"])
    (def s2 ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"])
    (test-assert(mxdiflg s1, s2), 13)))

(deftest a-test2
  (testing "mxdiflg"
    (def s1 [])
    (def s2 ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"])
    (test-assert(mxdiflg s1, s2), -1)))

(deftest a-test3
  (testing "mxdiflg"
    (def s1 ["ejjjjmmtthh" "zxxuueeg" "aanlljrrrxx" "dqqqaaabbb" "oocccffuucccjjjkkkjyyyeehh"])
    (def s2 ["bbbaaayddqbbrrrv"])
    (test-assert(mxdiflg s1, s2), 10)))
