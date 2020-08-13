package am.guide.newmydagger2.di

import am.guide.newmydagger2.*
import dagger.Module
import dagger.Provides

@Module
class MyModule {
    @Provides
    fun getBantaje(): Bantaje {
        return Bantaje()
    }

    @Provides
    fun getWhells(bantaje: Bantaje): Wheels {
        return Wheels(bantaje)
    }

    @Provides
    fun getMotor(galovka: Galovka): Motor {
        return Motor(galovka)
    }

    @Provides
    fun getGalovka(): Galovka {
        return Galovka()
    }

    @Provides
    fun getCar(motor: Motor, wheels: Wheels): Car {
        return Car(motor, wheels)
    }
}