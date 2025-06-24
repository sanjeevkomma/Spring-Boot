# Run OpenRewrite Recipes
* Once the plugin is configured, run the following Gradle task:
```bash
./gradlew rewriteDryRun --refresh-dependencies
./gradlew rewriteRun
```
* This will apply the recipes you've specified in the rewrite {} block.
# Finding Available Recipes
```bash
./gradlew rewriteDiscover
```
# To delete gradle cache in mac Local
```bash
rm -rf ~/.gradle/caches/modules-2/files-2.1/org.springframework.boot
```
# To temporarily set the JAVA_HOME path in macOS terminal (e.g., to Java 8), run the following command in your terminal window:
```bash
export JAVA_HOME=$(/usr/libexec/java_home -v 1.8)
echo $JAVA_HOME
```