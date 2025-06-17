# Run OpenRewrite Recipes
* Once the plugin is configured, run the following Gradle task:
```bash
./gradlew rewriteRun
```
* This will apply the recipes you've specified in the rewrite {} block.
# Finding Available Recipes
```bash
./gradlew rewriteDiscover
```