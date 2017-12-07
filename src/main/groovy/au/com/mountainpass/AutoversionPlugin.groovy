package au.com.mountainpass

import org.gradle.api.Project
import org.gradle.api.Plugin

class AutoversionPlugin implements Plugin<Project> {
    void apply(Project target) {
        target.task('hello', type: AutoversionTask)
    }
}
