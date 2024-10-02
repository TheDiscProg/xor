# SIMEX Utils
A libary of utils for use in SIMEX projects

## Is a String Defined?
A simple check if a field in a Simex message, or for that matter any string, is either defined or not.
```scala
def isFieldDefined(field: String): Boolean
```
Returns:
* False if the ```field``` is either *null*, an empty string or a string of empty spaces
* True otherwise

