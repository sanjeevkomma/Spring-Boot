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