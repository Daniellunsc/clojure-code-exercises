(ns codewars.array-diff)

(defn array-diff [a b]
  (vec (remove (zipmap b (repeat true)) a)))