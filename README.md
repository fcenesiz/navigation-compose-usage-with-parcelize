### app plugin
````groovy
id 'org.jetbrains.kotlin.jvm' version '1.8.0' apply false
````

### module plugins
````groovy
id 'kotlin-parcelize'
id 'org.jetbrains.kotlin.jvm' version '1.8.0' apply false
````

### dependency
````groovy
implementation "androidx.navigation:navigation-compose:2.5.3"
implementation 'io.github.raamcosta.compose-destinations:core:1.8.33-beta'
ksp 'io.github.raamcosta.compose-destinations:ksp:1.8.33-beta'
````
