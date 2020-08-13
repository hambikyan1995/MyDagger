package am.guide.newmydagger2

import am.guide.newmydagger2.di.DaggerIComponent
import am.guide.newmydagger2.di.IComponent
import android.app.Application

class MyApplication : Application() {

    companion object {
        lateinit var mComponent: IComponent
    }

    override fun onCreate() {
        super.onCreate()
        mComponent = DaggerIComponent.builder()
            .build()
    }
}