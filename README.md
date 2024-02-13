# XOR
A simple logical Exclusive OR Container for Scala.

It's signature is: `Xor[A, B]` where:
* `A` is the first type;
* `B` is the second type.

`Xor` can only contain one type or the other, not both nor neither... it must contain one and only one type.
As it is a container, it makes perfect sense for it to obey all the laws of a monad. Hence, you can:

*  lift a value using `applyLeft` or `applyRight`
* `fold` it
* apply side-effects using `foreach`
* `map` and `flatMap`



