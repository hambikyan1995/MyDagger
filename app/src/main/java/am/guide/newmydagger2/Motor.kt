package am.guide.newmydagger2

class Motor(private val galovka: Galovka) {

    fun getName(): String {
        return galovka.getName()
    }
}