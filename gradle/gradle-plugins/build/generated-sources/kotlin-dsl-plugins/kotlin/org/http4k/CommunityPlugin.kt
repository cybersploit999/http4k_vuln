package org.http4k


/**
 * Precompiled [community.gradle.kts][org.http4k.Community_gradle] script plugin.
 *
 * @see org.http4k.Community_gradle
 */
public
class CommunityPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("org.http4k.Community_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
