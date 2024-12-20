package org.http4k.internal


/**
 * Precompiled [license-check.gradle.kts][org.http4k.internal.License_check_gradle] script plugin.
 *
 * @see org.http4k.internal.License_check_gradle
 */
public
class LicenseCheckPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("org.http4k.internal.License_check_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
