package pattern

interface Shape {
    fun draw(x: Int, y: Int)
}

class Circle(private val color: String) : Shape {
    override fun draw(x: Int, y: Int) {
        println("Drawing a $color circle at ($x, $y)")
    }
}

class ShapeFactory {
    private val circleMap = mutableMapOf<String, Shape>()

    fun getCircle(color: String): Shape {
        var circle = circleMap[color]

        if (circle == null) {
            circle = Circle(color)
            circleMap[color] = circle
            println("Creating a $color circle")
        } else {
            println("Reusing a $color circle")
        }

        return circle
    }
}

fun main() {
    val factory = ShapeFactory()

    val redCircle1 = factory.getCircle("red")
    redCircle1.draw(10, 10)

    val blueCircle1 = factory.getCircle("blue")
    blueCircle1.draw(20, 20)

    val redCircle2 = factory.getCircle("red")
    redCircle2.draw(30, 30)

    val blueCircle2 = factory.getCircle("blue")
    blueCircle2.draw(40, 40)
}
