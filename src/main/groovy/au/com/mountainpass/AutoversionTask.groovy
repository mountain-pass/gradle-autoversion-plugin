package au.com.mountainpass

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class AutoversionTask extends DefaultTask {
    String greeting = 'hello from GreetingTask'

    @TaskAction
    def greet() {
        println greeting
    }
}