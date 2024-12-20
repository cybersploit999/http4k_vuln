package org.http4k


/**
 * Precompiled [conventions.gradle.kts][org.http4k.Conventions_gradle] script plugin.
 *
 * @see org.http4k.Conventions_gradle
 */
public
class ConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("org.http4k.Conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
