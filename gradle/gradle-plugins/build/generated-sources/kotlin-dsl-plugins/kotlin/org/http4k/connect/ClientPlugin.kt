package org.http4k.connect


/**
 * Precompiled [client.gradle.kts][org.http4k.connect.Client_gradle] script plugin.
 *
 * @see org.http4k.connect.Client_gradle
 */
public
class ClientPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("org.http4k.connect.Client_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
