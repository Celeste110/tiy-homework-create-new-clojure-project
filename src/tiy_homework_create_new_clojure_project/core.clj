    (ns tiy-homework-create-new-clojure-project.core)

    (defn -main []
      (let [
            a-num (+ 8 90)                                       ;; adding two numbers
            a-string  (if true                                   ;; control flow
                       "Clojure is a strange (but cool!) language"
                       "Looking forward to learning more about Clojure")
            a-boolean (= 2 10)                                   ;; testing equality
            is-null (nil? 78)
            get-middle-name (get {:firstName "Katherine"
                                :middleName "Celeste"} :middleName);; retrieving middle name from a map
            retrieve-a-color  (get ["Orange" "Green" "Blue"] 0);; retrieve the 1st element of the vector (index 0)
            colors ["Orange" "Green" "Blue"]                  ;; creating a vector with three strings
            a-list-of-nums '(9 8 7 6)                         ;; creating a list of numbers
            get-element-from-list (nth '(9 8 7 6)  3)         ;; retrieve 4th element (index 3) from the list
            increment-by-1 (inc 20.5)                         ;; using the inc function to increment the number by 1
            ]

        ;; 10 expressions:
         (println "Experimenting with Clojure... ");
         (println "1. Printing a number: " a-num);
         (println "2. The result of an if expression: " a-string)
         (println "3. Testing for equality (does 2 equal 10?): " a-boolean)
         (println "4. Check to see if the value 78 equals null: " is-null)
         (println "5. List of colors: " colors)
         (println "6. Getting my middle name from a map: " get-middle-name)
         (println "7. Retrieve a color from a vector: " retrieve-a-color)
         (println "8. A list of numbers: " a-list-of-nums)
         (println "9. Retrieve element from list: " get-element-from-list)
         (println "10. Increment a number by 1: " increment-by-1)

        )
      )
