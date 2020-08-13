package am.guide.newmydagger2

class Car(private val motor: Motor, private val wheels: Wheels) {

    fun getNAme(): String {
        return wheels.getName() + "   "+ motor.getName()
    }
}