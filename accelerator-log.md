# Accelerator Log

## Options
```json
{
  "chooseCluster" : "all",
  "enableLiveUpdate" : true,
  "greetingDescription" : "I dig mud baths",
  "greetingMessage" : "I'm a happy Hippo!",
  "imageRepo" : "guybalmas",
  "jvmVersion" : "17",
  "namespace" : "apps",
  "packageName" : "org.example",
  "projectName" : "happy-hippo"
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(GeneratorValidationTransform, UniquePath)
┃ ┏ ┏ engine.transformations[0].validated (Combo)
┃ ┃ ┃  Info Combo running as Chain(Merge(merge), UniquePath(UseLast))
┃ ┃ ┃ engine.transformations[0].validated.merge (Chain)
┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0] (Merge)
┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo, Combo, Combo, Combo, Combo, Combo)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Exclude)
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[0].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Exclude)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[0].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**/*]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/docs/index.md matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/mkdocs.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/values.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug config/values.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/README-ACCELERATOR.md matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/sample-acc.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/README.md matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/accelerator-no-fragments.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/enable-live-update/accelerator.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/java-rename-app/accelerator.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/java-rewrite-package/accelerator.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/jvm-version/accelerator.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/enable-live-update-fragment.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/java-rename-app-fragment.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/java-rewrite-package-fragment.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/jvm-version-fragment.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/template-catalog-info-fragment.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/template-workload-fragment.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/template-catalog-info/accelerator.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/template-workload/accelerator.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/ExampleApp.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/color/ColorPicker.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/config/OpenApiConfig.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/HelloController.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/KubernetesController.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/html/HtmlTemplate.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/kubernetes/K8sHandler.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/1.png matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/2.png matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/3.png matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/4.png matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/org/example/app/controllers/HelloControllerTests.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[0].<combo>.transformations[1] (Exclude)
┃ ┃ ┃ ┃ ┃ ┃  Info Will exclude [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/docs/index.md matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/mkdocs.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/values.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/values.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/README-ACCELERATOR.md matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/sample-acc.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/README.md matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/accelerator-no-fragments.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/enable-live-update/accelerator.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/java-rename-app/accelerator.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/java-rewrite-package/accelerator.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/jvm-version/accelerator.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/enable-live-update-fragment.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/java-rename-app-fragment.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/java-rewrite-package-fragment.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/jvm-version-fragment.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/template-catalog-info-fragment.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/template-workload-fragment.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/template-catalog-info/accelerator.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/template-workload/accelerator.yaml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/ExampleApp.java matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/color/ColorPicker.java matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/config/OpenApiConfig.java matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/HelloController.java matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/KubernetesController.java matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/html/HtmlTemplate.java matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/kubernetes/K8sHandler.java matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/1.png didn't match [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/2.png didn't match [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/3.png didn't match [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/4.png didn't match [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> included
┃ ┃ ┃ ┃ ┗ ┗ Debug src/test/java/org/example/app/controllers/HelloControllerTests.java matched [Tiltfile, config/*.yaml, catalog/**, target/**, docs/**, .vscode/**, **/*.java, pom.xml, fragments/**] -> excluded
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**/*.java]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/docs/index.md didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/mkdocs.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/values.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/values.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/README-ACCELERATOR.md didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/sample-acc.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/README.md didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/accelerator-no-fragments.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/enable-live-update/accelerator.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/java-rename-app/accelerator.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/java-rewrite-package/accelerator.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/jvm-version/accelerator.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/enable-live-update-fragment.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/java-rename-app-fragment.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/java-rewrite-package-fragment.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/jvm-version-fragment.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/template-catalog-info-fragment.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/template-workload-fragment.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/template-catalog-info/accelerator.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/template-workload/accelerator.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/ExampleApp.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/color/ColorPicker.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/config/OpenApiConfig.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/HelloController.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/KubernetesController.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/html/HtmlTemplate.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/kubernetes/K8sHandler.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/1.png didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/2.png didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/3.png didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/4.png didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/org/example/app/controllers/HelloControllerTests.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[1] (InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[1].validated (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Let(symbols, in: Chain(Merge(merge), UniquePath(UseLast)))
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[1].validated.merge (Let)
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Adding symbol formattedProjectName with value 'happy_hippo'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[1].validated.merge.in (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[1].validated.merge.in.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[1].validated.merge.in.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[1].validated.merge.in.transformations[0].sources[0].<combo> (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, RewritePath, OpenRewriteRecipe)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[1].validated.merge.in.transformations[0].sources[0].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**/*.java]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/ExampleApp.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/color/ColorPicker.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/config/OpenApiConfig.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/HelloController.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/KubernetesController.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/html/HtmlTemplate.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/kubernetes/K8sHandler.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/org/example/app/controllers/HelloControllerTests.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[1].validated.merge.in.transformations[0].sources[0].<combo>.transformations[1] (RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/org/example/app/ExampleApp.java' matched '(?<prefix>.*)org.example.app(?<suffix>.*)' with groups {prefix=src/main/java/, suffix=/ExampleApp.java, g0=src/main/java/org/example/app/ExampleApp.java, g1=src/main/java/, g2=/ExampleApp.java} and was rewritten to 'src/main/java/org.example.happy_hippo/ExampleApp.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/org/example/app/color/ColorPicker.java' matched '(?<prefix>.*)org.example.app(?<suffix>.*)' with groups {prefix=src/main/java/, suffix=/color/ColorPicker.java, g0=src/main/java/org/example/app/color/ColorPicker.java, g1=src/main/java/, g2=/color/ColorPicker.java} and was rewritten to 'src/main/java/org.example.happy_hippo/color/ColorPicker.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/org/example/app/config/OpenApiConfig.java' matched '(?<prefix>.*)org.example.app(?<suffix>.*)' with groups {prefix=src/main/java/, suffix=/config/OpenApiConfig.java, g0=src/main/java/org/example/app/config/OpenApiConfig.java, g1=src/main/java/, g2=/config/OpenApiConfig.java} and was rewritten to 'src/main/java/org.example.happy_hippo/config/OpenApiConfig.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/org/example/app/controllers/HelloController.java' matched '(?<prefix>.*)org.example.app(?<suffix>.*)' with groups {prefix=src/main/java/, suffix=/controllers/HelloController.java, g0=src/main/java/org/example/app/controllers/HelloController.java, g1=src/main/java/, g2=/controllers/HelloController.java} and was rewritten to 'src/main/java/org.example.happy_hippo/controllers/HelloController.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/org/example/app/controllers/KubernetesController.java' matched '(?<prefix>.*)org.example.app(?<suffix>.*)' with groups {prefix=src/main/java/, suffix=/controllers/KubernetesController.java, g0=src/main/java/org/example/app/controllers/KubernetesController.java, g1=src/main/java/, g2=/controllers/KubernetesController.java} and was rewritten to 'src/main/java/org.example.happy_hippo/controllers/KubernetesController.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/org/example/app/html/HtmlTemplate.java' matched '(?<prefix>.*)org.example.app(?<suffix>.*)' with groups {prefix=src/main/java/, suffix=/html/HtmlTemplate.java, g0=src/main/java/org/example/app/html/HtmlTemplate.java, g1=src/main/java/, g2=/html/HtmlTemplate.java} and was rewritten to 'src/main/java/org.example.happy_hippo/html/HtmlTemplate.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/org/example/app/kubernetes/K8sHandler.java' matched '(?<prefix>.*)org.example.app(?<suffix>.*)' with groups {prefix=src/main/java/, suffix=/kubernetes/K8sHandler.java, g0=src/main/java/org/example/app/kubernetes/K8sHandler.java, g1=src/main/java/, g2=/kubernetes/K8sHandler.java} and was rewritten to 'src/main/java/org.example.happy_hippo/kubernetes/K8sHandler.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug Path 'src/test/java/org/example/app/controllers/HelloControllerTests.java' matched '(?<prefix>.*)org.example.app(?<suffix>.*)' with groups {prefix=src/test/java/, suffix=/controllers/HelloControllerTests.java, g0=src/test/java/org/example/app/controllers/HelloControllerTests.java, g1=src/test/java/, g2=/controllers/HelloControllerTests.java} and was rewritten to 'src/test/java/org.example.happy_hippo/controllers/HelloControllerTests.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ ╺ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[1].validated.merge.in.transformations[0].sources[0].<combo>.transformations[2] (OpenRewriteRecipe)
┃ ┃ ┃ ┃ ┗ ┗ ┗ ┗ ╺ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[1].validated.merge.in.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, InvokeFragment, InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [pom.xml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/docs/index.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/mkdocs.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/values.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/values.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/README-ACCELERATOR.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/sample-acc.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/README.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/accelerator-no-fragments.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/enable-live-update/accelerator.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/java-rename-app/accelerator.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/java-rewrite-package/accelerator.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/jvm-version/accelerator.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/enable-live-update-fragment.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/java-rename-app-fragment.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/java-rewrite-package-fragment.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/jvm-version-fragment.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/template-catalog-info-fragment.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/template-workload-fragment.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/template-catalog-info/accelerator.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/template-workload/accelerator.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/ExampleApp.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/color/ColorPicker.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/config/OpenApiConfig.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/HelloController.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/KubernetesController.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/html/HtmlTemplate.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/kubernetes/K8sHandler.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/1.png didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/2.png didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/3.png didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/4.png didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/org/example/app/controllers/HelloControllerTests.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[1] (InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[1].validated (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Let(symbols, in: Chain(Merge(merge), UniquePath(UseLast)))
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[1].validated.merge (Let)
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Adding symbol jvmPomPatch with value '<java.version>17</java.version>'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[1].validated.merge.in (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[1].validated.merge.in.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[1].validated.merge.in.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[1].validated.merge.in.transformations[0].sources[0].<combo> (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[1].validated.merge.in.transformations[0].sources[0].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [pom.xml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug pom.xml matched [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[1].validated.merge.in.transformations[0].sources[0].<combo>.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗  Info Will replace regex '<java.version>11</java.version>' with '<java.version>17</ja...(truncated)'
┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗ ╺ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[1].validated.merge.in.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[2] (InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[2].validated (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Let(symbols, in: Chain(Merge(merge), UniquePath(UseLast)))
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[2].validated.merge (Let)
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Adding symbol appNamePomPatch with value '<name>happy-hippo</name>'
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Adding symbol appArtifactIdPomPatch with value '<artifactId>happy-hippo</artifactId>'
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Adding symbol appGroupIdPomPatch with value '<groupId>org.example</groupId>'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[2].validated.merge.in (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[2].validated.merge.in.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[2].validated.merge.in.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[2].validated.merge.in.transformations[0].sources[0].<combo> (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText, ReplaceText, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[2].validated.merge.in.transformations[0].sources[0].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [pom.xml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug pom.xml matched [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[2].validated.merge.in.transformations[0].sources[0].<combo>.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace regex '<name>app</name>' with '<name>happy-hippo</n...(truncated)'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[2].validated.merge.in.transformations[0].sources[0].<combo>.transformations[2] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace regex '<artifactId>app</artifactId>' with '<artifactId>happy-hi...(truncated)'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[2].validated.merge.in.transformations[0].sources[0].<combo>.transformations[3] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗  Info Will replace regex '<groupId>com.example</groupId>' with '<groupId>org.example...(truncated)'
┃ ┃ ┃ ┃ ┗ ┗ ┗ ┗ ╺ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[2].validated.merge.in.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [config/*.yaml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/docs/index.md didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/mkdocs.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/values.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/values.yaml matched [config/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [config/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/README-ACCELERATOR.md didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/sample-acc.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/README.md didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/accelerator-no-fragments.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/enable-live-update/accelerator.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/java-rename-app/accelerator.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/java-rewrite-package/accelerator.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/jvm-version/accelerator.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/enable-live-update-fragment.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/java-rename-app-fragment.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/java-rewrite-package-fragment.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/jvm-version-fragment.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/template-catalog-info-fragment.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/template-workload-fragment.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/template-catalog-info/accelerator.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/template-workload/accelerator.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/ExampleApp.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/color/ColorPicker.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/config/OpenApiConfig.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/HelloController.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/KubernetesController.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/html/HtmlTemplate.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/kubernetes/K8sHandler.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/1.png didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/2.png didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/3.png didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/4.png didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/org/example/app/controllers/HelloControllerTests.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1] (InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1] (Let)
┃ ┃ ┃ ┃ ┃ ┃ Debug Adding symbol jvmVersion with value '17'
┃ ┃ ┃ ┃ ┃ ┃ ┏ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1].in.validated (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Let(symbols, in: Chain(Merge(merge), UniquePath(UseLast)))
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1].in.validated.merge (Let)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Adding symbol jvmWorkloadPatch with value '17'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1].in.validated.merge.in (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1].in.validated.merge.in.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1].in.validated.merge.in.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1].in.validated.merge.in.transformations[0].sources[0].<combo> (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText, YTT)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1].in.validated.merge.in.transformations[0].sources[0].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [config/*.yaml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/values.yaml matched [config/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug config/workload.yaml matched [config/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1].in.validated.merge.in.transformations[0].sources[0].<combo>.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [default-java-version->17, default-project-name->happy-hippo, default-greeting-message->I'm a happy Hippo!, default-greeting-description->I dig mud baths]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1].in.validated.merge.in.transformations[0].sources[0].<combo>.transformations[2] (YTT)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Wrote values file with json content:   {"chooseCluster":"all","artifactVersion":"0.0.1-beta","greetingMessage":"I'm a happy Hippo!","jvmVersion":"17","jvmWorkloadPatch":"17","namespace":"apps","imageRepo":"guybalmas","artifactId":"happy-hippo","packageName":"org.example","projectName":"happy-hippo","greetingDescription":"I dig mud baths","enableLiveUpdate":true}
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗  Info Shelling out to YTT with args: [ytt, -f, /tmp/ytt-input8468775404402363763, --data-values-file, /tmp/accelerator-options8093393841368857539.json, --output-files, /tmp/ytt-output5880180963907569959]
┃ ┃ ┃ ┃ ┗ ┗ ┗ ┗ ┗ ╺ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1].in.validated.merge.in.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[4] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [catalog/*.yaml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/docs/index.md didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/mkdocs.yaml matched [catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/values.yaml matched [catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug config/values.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/README-ACCELERATOR.md didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/sample-acc.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/README.md didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/accelerator-no-fragments.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/enable-live-update/accelerator.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/java-rename-app/accelerator.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/java-rewrite-package/accelerator.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/jvm-version/accelerator.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/enable-live-update-fragment.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/java-rename-app-fragment.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/java-rewrite-package-fragment.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/jvm-version-fragment.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/template-catalog-info-fragment.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/template-workload-fragment.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/template-catalog-info/accelerator.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/template-workload/accelerator.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/ExampleApp.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/color/ColorPicker.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/config/OpenApiConfig.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/HelloController.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/KubernetesController.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/html/HtmlTemplate.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/kubernetes/K8sHandler.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/1.png didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/2.png didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/3.png didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/4.png didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/org/example/app/controllers/HelloControllerTests.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[1] (InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[1] (Let)
┃ ┃ ┃ ┃ ┃ ┃ Debug Adding symbol namespace with value 'apps'
┃ ┃ ┃ ┃ ┃ ┃ Debug Adding symbol jvmVersion with value '17'
┃ ┃ ┃ ┃ ┃ ┃ ┏ ┏ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[1].in.validated (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Merge(merge), UniquePath(UseLast))
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[1].in.validated.merge (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[1].in.validated.merge.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[1].in.validated.merge.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[1].in.validated.merge.transformations[0].sources[0].<combo> (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText, YTT)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[1].in.validated.merge.transformations[0].sources[0].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [catalog/*.yaml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/mkdocs.yaml matched [catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug catalog/values.yaml matched [catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[1].in.validated.merge.transformations[0].sources[0].<combo>.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [default-java-version->17, default-apps-namespace->apps, default-project-name->happy-hippo]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[1].in.validated.merge.transformations[0].sources[0].<combo>.transformations[2] (YTT)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Wrote values file with json content:   {"chooseCluster":"all","artifactVersion":"0.0.1-beta","greetingMessage":"I'm a happy Hippo!","jvmVersion":"17","namespace":"apps","imageRepo":"guybalmas","artifactId":"happy-hippo","packageName":"org.example","projectName":"happy-hippo","greetingDescription":"I dig mud baths","enableLiveUpdate":true}
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗  Info Shelling out to YTT with args: [ytt, -f, /tmp/ytt-input12637467074396829066, --data-values-file, /tmp/accelerator-options14763529779156613473.json, --output-files, /tmp/ytt-output3810727487404554497]
┃ ┃ ┃ ┃ ┗ ┗ ┗ ┗ ╺ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[1].in.validated.merge.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[5] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [Tiltfile]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/docs/index.md didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/mkdocs.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/values.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/values.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/README-ACCELERATOR.md didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/sample-acc.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/README.md didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/accelerator-no-fragments.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/enable-live-update/accelerator.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/java-rename-app/accelerator.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/java-rewrite-package/accelerator.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/jvm-version/accelerator.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/enable-live-update-fragment.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/java-rename-app-fragment.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/java-rewrite-package-fragment.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/jvm-version-fragment.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/template-catalog-info-fragment.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/template-workload-fragment.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/template-catalog-info/accelerator.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/template-workload/accelerator.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/ExampleApp.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/color/ColorPicker.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/config/OpenApiConfig.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/HelloController.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/KubernetesController.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/html/HtmlTemplate.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/kubernetes/K8sHandler.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/1.png didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/2.png didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/3.png didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/4.png didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/org/example/app/controllers/HelloControllerTests.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo>.transformations[1] (InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo>.transformations[1] (Let)
┃ ┃ ┃ ┃ ┃ ┃ Debug Adding symbol namespace with value 'apps'
┃ ┃ ┃ ┃ ┃ ┃ ┏ ┏ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo>.transformations[1].in.validated (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Merge(merge), UniquePath(UseLast))
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo>.transformations[1].in.validated.merge (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo>.transformations[1].in.validated.merge.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo>.transformations[1].in.validated.merge.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Condition (#chooseCluster == 'all' and #enableLiveUpdate) evaluated to true
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo>.transformations[1].in.validated.merge.transformations[0].sources[0].<combo> (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Condition (#chooseCluster == 'all' and #enableLiveUpdate) evaluated to true
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo>.transformations[1].in.validated.merge.transformations[0].sources[0].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [Tiltfile]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug Tiltfile matched [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo>.transformations[1].in.validated.merge.transformations[0].sources[0].<combo>.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗  Info Will replace ['<k8s-context>'->k8s_context(), <default-namespace>->apps, <default-image-repo-name>->guybalmas, <default-project-name>->happy-hippo]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo>.transformations[1].in.validated.merge.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Condition (#chooseCluster == 'local' and #enableLiveUpdate) evaluated to false
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ null ()
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo>.transformations[1].in.validated.merge.transformations[0].sources[2] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Condition (#chooseCluster == 'specificCluster' and #enableLiveUpdate) evaluated to false
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ null ()
┃ ┃ ┃ ┃ ┗ ┗ ┗ ┗ ╺ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo>.transformations[1].in.validated.merge.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[6] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[6].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[6].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [catalog/docs/*.md]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/docs/index.md matched [catalog/docs/*.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/mkdocs.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/values.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/values.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/README-ACCELERATOR.md didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/sample-acc.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/README.md didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/accelerator-no-fragments.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/enable-live-update/accelerator.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/java-rename-app/accelerator.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/java-rewrite-package/accelerator.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/jvm-version/accelerator.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/enable-live-update-fragment.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/java-rename-app-fragment.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/java-rewrite-package-fragment.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/jvm-version-fragment.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/template-catalog-info-fragment.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/manifests/template-workload-fragment.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/template-catalog-info/accelerator.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug fragments/template-workload/accelerator.yaml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/ExampleApp.java didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/color/ColorPicker.java didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/config/OpenApiConfig.java didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/HelloController.java didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/controllers/KubernetesController.java didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/html/HtmlTemplate.java didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/example/app/kubernetes/K8sHandler.java didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/1.png didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/2.png didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/3.png didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/images/4.png didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/org/example/app/controllers/HelloControllerTests.java didn't match [catalog/docs/*.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[6].<combo>.transformations[1] (ReplaceText)
┃ ┃ ┃ ┗ ┗ ┗  Info Will replace regex 'Tanzu Java Web App' with 'happy hippo'
┃ ┗ ┗ ╺ engine.transformations[0].validated.merge.transformations[1] (UniquePath)
┗ ╺ engine.transformations[1] (UniquePath)
```
