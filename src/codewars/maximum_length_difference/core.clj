(ns codewars.maximum-length-difference.core)

(defn abs [n] (max n (- n)))

(defn mxdiflg [a1 a2]
  (reduce max -1 (for [x a1 y a2] (abs (- (count x) (count y))))))
