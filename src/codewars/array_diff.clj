(ns codewars.array-diff)

(defn array-diff [a b]
  (remove (set b) a))