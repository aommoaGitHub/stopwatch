# Stopwatch tasks by Vittunyuta Maeprasart (5910545019)
I ran 6 tasks on a Mac book pro, and got these results:

Task                                                   | Time
-------------------------------------------------------|-------------: 
Append 50,000 chars to String                          | 0.999333 sec 
Append 100,000 chars to String                         | 2.813876 sec 
Append 100,000 chars to StringBuilder                  | 0.002223 sec
Sum array of double primitives with count is 1 billion | 1.552236 sec
Sum array of Double objects with count is 1 billion    | 6.164611 sec
Sum array of BigDecimal with count is 1 billion        | 11.327104 sec


## Explanation of Results
*****
### String and StringBuilder
From comparing the same chars of append String and StringBuilder Task(task 2 and 3), it shows that StringBuilder is faster than String.
To add **String**, like using '+' 2 String, it will create a new address in memory. Then the variable turn to point to the new address. So if we add 100,000 chars it will create new address at least 100,000 times.
On the same way, **StringBuilder** works like String but StringBuilder has it default capacity. Initial its capacity is 18. If we add chars more than 18, StringBuilder will create new address of char[] that its capacity is 38(or 18x2+2). If we add more than its capacity again, the new capacity will be 78(or 38x2+2). So if we add 100,000 chars, surely it will create less than 100,000 times.
*****
### double, Double and BigDecimal
The table indicates that in the same count, summing array of double is the fastest. Double is the second. And BigDecimal is slowest.
**double** is a primitive type that will be put into registers. Registers are very fast processing. Primitive type doesn't like Object type such as 'Double' and 'BigDecimal'. It doesn't have any attributes and methods. Also, store less digit cause taking less time for computation.
**Double** and **BigDecimal** work like 'String' but 'BigDecimal' store digit larger than 'Double' and 'double'. So 'BigDecimal' take a lot of time for computation.
*****
