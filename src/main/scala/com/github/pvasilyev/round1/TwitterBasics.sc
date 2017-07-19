1 + 1
val two = 1 + 1
var name = "steve"
def addOne(m: Int): Int = m + 1
addOne(3)
(x: Int) => x + 1
def adder(m: Int, n: Int) = m + n
val add2 = adder(2, _:Int)
add2(5)

def multiply(m: Int)(n: Int): Int = m * n
multiply(2)(3)
def mul3 = multiply(3)_
mul3(5)

def curriedAdd = (adder _).curried
curriedAdd(1)(2)
