package am.guide.newmydagger2.di

import am.guide.newmydagger2.MainActivity
import dagger.Component

@Component(modules = [MyModule::class])
interface IComponent {
    fun inject(mainActivity: MainActivity)
}