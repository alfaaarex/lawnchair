package app.lawnchair.icons

import android.content.Context
import app.lawnchair.preferences2.PreferenceManager2
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.dagger.LauncherAppSingleton
import com.android.launcher3.graphics.ThemeManager
import com.android.launcher3.util.DaggerSingletonTracker
import dagger.Module
import dagger.Provides

@Module
class ThemeManagerModule {

    @Provides
    @LauncherAppSingleton
    fun provideThemeManager(
        context: Context,
        prefs: LauncherPrefs,
        iconControllerFactory: ThemeManager.IconControllerFactory,
        lifecycle: DaggerSingletonTracker,
        prefs2: PreferenceManager2,
    ): ThemeManager {
        return LawnchairThemeManager(
            context = context,
            prefs = prefs,
            iconControllerFactory = iconControllerFactory,
            lifecycle = lifecycle,
            prefs2 = prefs2,
        )
    }
}
