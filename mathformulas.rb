class MathFormulas
     def fibonacci(limit = 100)
         first_number = 0
         second_number = 1
         sequence = [0,1]
         num = 0

         while num < limit do
             next_number = first_number + second_number
             sequence.push(next_number)
             first_number = second_number
             second_number = next_number
             num = num + 1
        end

        puts sequence
     end
end
