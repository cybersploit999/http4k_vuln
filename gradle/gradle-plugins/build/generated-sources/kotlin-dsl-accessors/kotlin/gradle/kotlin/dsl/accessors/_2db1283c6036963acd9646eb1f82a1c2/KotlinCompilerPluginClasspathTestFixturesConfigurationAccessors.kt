
/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress(
    "unused",
    "nothing_to_inline",
    "useless_cast",
    "unchecked_cast",
    "extension_shadowed_by_member",
    "redundant_projection",
    "RemoveRedundantBackticks",
    "ObjectPropertyName",
    "deprecation",
    "detekt:all"
)
@file:org.gradle.api.Generated

package gradle.kotlin.dsl.accessors._2db1283c6036963acd9646eb1f82a1c2


import org.gradle.api.Action
import org.gradle.api.Incubating
import org.gradle.api.NamedDomainObjectProvider
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.artifacts.Configuration
import org.gradle.api.artifacts.ConfigurablePublishArtifact
import org.gradle.api.artifacts.ConfigurationContainer
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.DependencyConstraint
import org.gradle.api.artifacts.ExternalModuleDependency
import org.gradle.api.artifacts.ModuleDependency
import org.gradle.api.artifacts.PublishArtifact
import org.gradle.api.artifacts.dsl.ArtifactHandler
import org.gradle.api.artifacts.dsl.DependencyConstraintHandler
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.api.initialization.SharedModelDefaults
import org.gradle.api.provider.Provider
import org.gradle.api.provider.ProviderConvertible
import org.gradle.api.tasks.TaskContainer
import org.gradle.api.tasks.TaskProvider

import org.gradle.kotlin.dsl.*
import org.gradle.kotlin.dsl.accessors.runtime.*


/**
 * Adds a dependency to the 'kotlinCompilerPluginClasspathTestFixtures' configuration.
 *
 * @param dependencyNotation notation for the dependency to be added.
 * @return The dependency.
 *
 * @see [DependencyHandler.add]
 */
internal
fun DependencyHandler.`kotlinCompilerPluginClasspathTestFixtures`(dependencyNotation: Any): Dependency? =
    add("kotlinCompilerPluginClasspathTestFixtures", dependencyNotation)

/**
 * Adds a dependency to the 'kotlinCompilerPluginClasspathTestFixtures' configuration.
 *
 * @param dependencyNotation notation for the dependency to be added.
 * @param dependencyConfiguration expression to use to configure the dependency.
 * @return The dependency.
 *
 * @see [DependencyHandler.add]
 */
internal
fun DependencyHandler.`kotlinCompilerPluginClasspathTestFixtures`(
    dependencyNotation: String,
    dependencyConfiguration: Action<ExternalModuleDependency>
): ExternalModuleDependency = addDependencyTo(
    this, "kotlinCompilerPluginClasspathTestFixtures", dependencyNotation, dependencyConfiguration
) as ExternalModuleDependency

/**
 * Adds a dependency to the 'kotlinCompilerPluginClasspathTestFixtures' configuration.
 *
 * @param dependencyNotation notation for the dependency to be added.
 * @param dependencyConfiguration expression to use to configure the dependency.
 * @return The dependency.
 *
 * @see [DependencyHandler.add]
 */
internal
fun DependencyHandler.`kotlinCompilerPluginClasspathTestFixtures`(
    dependencyNotation: Provider<*>,
    dependencyConfiguration: Action<ExternalModuleDependency>
): Unit = addConfiguredDependencyTo(
    this, "kotlinCompilerPluginClasspathTestFixtures", dependencyNotation, dependencyConfiguration
)

/**
 * Adds a dependency to the 'kotlinCompilerPluginClasspathTestFixtures' configuration.
 *
 * @param dependencyNotation notation for the dependency to be added.
 * @param dependencyConfiguration expression to use to configure the dependency.
 * @return The dependency.
 *
 * @see [DependencyHandler.add]
 */
internal
fun DependencyHandler.`kotlinCompilerPluginClasspathTestFixtures`(
    dependencyNotation: ProviderConvertible<*>,
    dependencyConfiguration: Action<ExternalModuleDependency>
): Unit = addConfiguredDependencyTo(
    this, "kotlinCompilerPluginClasspathTestFixtures", dependencyNotation, dependencyConfiguration
)

/**
 * Adds a dependency to the 'kotlinCompilerPluginClasspathTestFixtures' configuration.
 *
 * @param group the group of the module to be added as a dependency.
 * @param name the name of the module to be added as a dependency.
 * @param version the optional version of the module to be added as a dependency.
 * @param configuration the optional configuration of the module to be added as a dependency.
 * @param classifier the optional classifier of the module artifact to be added as a dependency.
 * @param ext the optional extension of the module artifact to be added as a dependency.
 * @param dependencyConfiguration expression to use to configure the dependency.
 * @return The dependency.
 *
 * @see [DependencyHandler.create]
 * @see [DependencyHandler.add]
 */
internal
fun DependencyHandler.`kotlinCompilerPluginClasspathTestFixtures`(
    group: String,
    name: String,
    version: String? = null,
    configuration: String? = null,
    classifier: String? = null,
    ext: String? = null,
    dependencyConfiguration: Action<ExternalModuleDependency>? = null
): ExternalModuleDependency = addExternalModuleDependencyTo(
    this, "kotlinCompilerPluginClasspathTestFixtures", group, name, version, configuration, classifier, ext, dependencyConfiguration
)

/**
 * Adds a dependency to the 'kotlinCompilerPluginClasspathTestFixtures' configuration.
 *
 * @param dependency dependency to be added.
 * @param dependencyConfiguration expression to use to configure the dependency.
 * @return The dependency.
 *
 * @see [DependencyHandler.add]
 */
internal
fun <T : ModuleDependency> DependencyHandler.`kotlinCompilerPluginClasspathTestFixtures`(
    dependency: T,
    dependencyConfiguration: T.() -> Unit
): T = add("kotlinCompilerPluginClasspathTestFixtures", dependency, dependencyConfiguration)

/**
 * Adds a dependency constraint to the 'kotlinCompilerPluginClasspathTestFixtures' configuration.
 *
 * @param constraintNotation the dependency constraint notation
 *
 * @return the added dependency constraint
 *
 * @see [DependencyConstraintHandler.add]
 */
internal
fun DependencyConstraintHandler.`kotlinCompilerPluginClasspathTestFixtures`(constraintNotation: Any): DependencyConstraint =
    add("kotlinCompilerPluginClasspathTestFixtures", constraintNotation)

/**
 * Adds a dependency constraint to the 'kotlinCompilerPluginClasspathTestFixtures' configuration.
 *
 * @param constraintNotation the dependency constraint notation
 * @param block the block to use to configure the dependency constraint
 *
 * @return the added dependency constraint
 *
 * @see [DependencyConstraintHandler.add]
 */
internal
fun DependencyConstraintHandler.`kotlinCompilerPluginClasspathTestFixtures`(constraintNotation: Any, block: DependencyConstraint.() -> Unit): DependencyConstraint =
    add("kotlinCompilerPluginClasspathTestFixtures", constraintNotation, block)

/**
 * Adds an artifact to the 'kotlinCompilerPluginClasspathTestFixtures' configuration.
 *
 * @param artifactNotation the group of the module to be added as a dependency.
 * @return The artifact.
 *
 * @see [ArtifactHandler.add]
 */
internal
fun ArtifactHandler.`kotlinCompilerPluginClasspathTestFixtures`(artifactNotation: Any): PublishArtifact =
    add("kotlinCompilerPluginClasspathTestFixtures", artifactNotation)

/**
 * Adds an artifact to the 'kotlinCompilerPluginClasspathTestFixtures' configuration.
 *
 * @param artifactNotation the group of the module to be added as a dependency.
 * @param configureAction The action to execute to configure the artifact.
 * @return The artifact.
 *
 * @see [ArtifactHandler.add]
 */
internal
fun ArtifactHandler.`kotlinCompilerPluginClasspathTestFixtures`(
    artifactNotation: Any,
    configureAction:  ConfigurablePublishArtifact.() -> Unit
): PublishArtifact =
    add("kotlinCompilerPluginClasspathTestFixtures", artifactNotation, configureAction)



