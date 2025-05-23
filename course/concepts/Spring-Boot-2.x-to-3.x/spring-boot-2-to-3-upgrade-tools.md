
# 🛠️ Tools to Upgrade Spring Boot 2.x to 3.x

Upgrading from **Spring Boot 2.x to 3.x** is a significant change because Spring Boot 3.x is based on **Spring Framework 6** and **Jakarta EE 10**, which introduces **breaking changes** — especially in **package names, Java version compatibility, and dependencies**.

Here are the **best tools and strategies** to upgrade safely and efficiently:

---

## ✅ Spring Boot Migrator
**Tool:** [`spring-boot-migrator`](https://github.com/spring-projects-experimental/spring-boot-migrator)

- Official experimental tool by Spring team.
- Analyzes your project and suggests necessary changes (including `javax` → `jakarta` package renames).
- Helps with dependency upgrades and deprecated API usage.

### Install
```bash
sdk install springboot-migrator
```

### Run it
```bash
sbm spring-boot-upgrade -t 3.0.0 .
```

---

## ✅ OpenRewrite (via Moderne or CLI)
**Tool:** [`OpenRewrite`](https://docs.openrewrite.org/)

- Automated refactoring tool.
- Has ready-made recipes for **Spring Boot 2 → 3** upgrade.
- Rewrites Java source code, POM files, and configurations.

### Run the Recipe
```bash
./gradlew rewriteRun
```

### Add to `build.gradle`
```groovy
plugins {
  id("org.openrewrite.rewrite") version("6.0.0") // example
}
rewrite {
  activeRecipe("org.openrewrite.java.spring.boot3.UpgradeSpringBoot_3_0")
}
```

---

## 🧭 Spring Initializr Comparison
**Tool:** [https://start.spring.io](https://start.spring.io)

- Create a new Spring Boot 3.2+ project and compare the generated build file (`pom.xml` or `build.gradle`) and main application structure with your existing one.

---

## 📦 Maven Dependency Analyzer
**Plugin:** `versions-maven-plugin`

To detect outdated dependencies and update versions:

```bash
mvn versions:display-dependency-updates
mvn versions:display-plugin-updates
```

---

## ✅ Manual Checklist

| Task | Why It Matters |
|------|----------------|
| ✅ **Migrate from `javax.*` to `jakarta.*`** | Required due to Jakarta EE 10 |
| ✅ **Upgrade to Java 17 or higher** | Spring Boot 3 requires Java 17+ |
| ✅ **Upgrade all Spring dependencies** | Some are no longer compatible |
| ✅ **Update 3rd-party libraries** | Ensure they support Jakarta EE |
| ✅ **Replace deprecated config properties** | Properties may have changed |
| ✅ **Re-test actuator endpoints** | Format, paths, and metrics may differ |

---

## 📄 Resources

- [Official Spring Boot 3 Migration Guide](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#migration)
- [Spring Boot Migrator GitHub](https://github.com/spring-projects-experimental/spring-boot-migrator)
- [Jakarta EE migration cheat sheet](https://jakarta.ee/)

---

## ✅ Summary

| Tool | Best For |
|------|----------|
| **Spring Boot Migrator** | Full project analysis |
| **OpenRewrite** | Code-level rewrites and automation |
| **Spring Initializr** | Comparing new vs old project structure |
| **Manual review** | Ensuring custom code migration |
