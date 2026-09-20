plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }

android { namespace = "com.almolook.app"; compileSdk = 35
    defaultConfig { applicationId = "com.almolook.app"; minSdk = 24; targetSdk = 35; versionCode = 1; versionName = "1.0" }
}

dependencies { implementation("com.google.android.gms:play-services-ads:24.6.0") }
