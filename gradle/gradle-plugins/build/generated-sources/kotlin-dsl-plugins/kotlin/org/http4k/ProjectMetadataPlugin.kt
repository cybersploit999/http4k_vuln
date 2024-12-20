package org.http4k


/**
 * Precompiled [project-metadata.gradle.kts][org.http4k.Project_metadata_gradle] script plugin.
 *
 * @see org.http4k.Project_metadata_gradle
 */
public
class ProjectMetadataPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("org.http4k.Project_metadata_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
