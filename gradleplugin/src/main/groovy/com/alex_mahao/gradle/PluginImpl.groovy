package  com.alex_mahao.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 实现Plugin
 */
public class PluginImpl implements Plugin<Project>{

    @Override
    void apply(Project project) {
        project.task("testTask")<<{
            println "Hello gradle plugin"
        }
    }
}