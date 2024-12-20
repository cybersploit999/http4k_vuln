package org.http4k.internal


/**
 * Precompiled [code-coverage.gradle.kts][org.http4k.internal.Code_coverage_gradle] script plugin.
 *
 * @see org.http4k.internal.Code_coverage_gradle
 */
public
class CodeCoveragePlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("org.http4k.internal.Code_coverage_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
