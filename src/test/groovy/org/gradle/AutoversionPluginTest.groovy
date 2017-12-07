package org.gradle

import static org.junit.Assert.*

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

import au.com.mountainpass.AutoversionTask

class AutoversionPluginTest {
	@Test
	public void test() {
		Project project = ProjectBuilder.builder().build()
		project.pluginManager.apply 'au.com.mountainpass.autoversion'

		assertTrue(project.tasks.hello instanceof AutoversionTask)
	}
}
