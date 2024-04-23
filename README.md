# SIMEX Utils
A libary of utils for use in SIMEX projects

## XOR
A simple logical Exclusive OR Container for Scala.

It's signature is: `Xor[A, B]` where:
* `A` is the first type;
* `B` is the second type.

`Xor` can only contain one type or the other, not both nor neither... it must contain one and only one type.
Sadly, it's not a Monad, hence, you cannot use `flatMap` and `map` in a `for comprehension`. But , you can:
*  lift a value using `applyLeft` or `applyRight`
* `fold` it
* apply side effects using `foreach`
* `map` and `flatMap`

## Is a String Defined?
A simple check if a field in a Simex message, or for that matter any string, is either defined or not.
```scala
def isFieldDefined(field: String): Boolean
```
Returns:
* False if the ```field``` is either *null*, an empty string or a string of empty spaces
* True otherwise

