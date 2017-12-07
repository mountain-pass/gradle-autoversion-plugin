# gradle-autoversion-plugin
_**- Manually setting project.version? Ain't nobody got time for dat!**_

Mountain Pass's gradle-autoversion-plugin goal is to assist with Continuous Delivery and Continuous Deployment by automatically setting `project.version`, based on an increment of the most recent release version, by querying your release repository.

The plugin uses your release repository as the source of truth for versioning, so it doesn't need to update any files in your source repository and there is nothing to commit back to source control after a release and there is no way for the versioning to become out-of-sync with what has actually been released.

The plugin assumes that you will be creating your versioned files on a CI server, so when you are building locally, the plugin simply sets the version to `LOCAL`. This avoids the build having an unnecessary dependency on being able to query your release repository and avoids creating a delay on each build while the version is calculated.

## Usage

coming soon

## Similar Plugins

There are other Gradle automatic versioning plugins available that do a similar job to this plugin. None of them suited our needs, but you might prefer them. Some of them even have logos; We don't have a logo.

 - https://github.com/davideas/GrabVer
 - https://github.com/mazzeb/gradle-auto-version
 - https://github.com/karriereat/gradle-version-plugin
 - https://github.com/Zoltu/Gradle.Plugin.Versioning
 - https://github.com/XavierTalpe/gradle-release-plugin
 - https://github.com/jgitver/gradle-jgitver-plugin
 
