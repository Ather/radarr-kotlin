# This is a placeholder readme. The project has not been released on Maven Central, as of yet.

**Pull requests (for example to support more API endpoints, bug fixes) are welcome!**

# radarr-kotlin

Radarr API wrapper in Java written using retrofit.

Currently supported [Radarr API](https://github.com/Radarr/Radarr/wiki/API) API version: as of `0.2.0.1217`

[Supported endpoints](https://github.com/Ather/radarr-kotlin/issues/1)

## Usage
<a href="https://search.maven.org/search?q=radarr-kotlin">Available on Maven Central</a>

Get via Gradle:
```groovy
implementation 'app.ather.radarr:radarr-kotlin:1.0.0'
```

Or Maven:
```xml
<dependency>
    <groupId>app.ather.radarr</groupId>
    <artifactId>radarr-kotlin</artifactId>
    <version>1.0.0</version>
</dependency>
```

Use like any other retrofit2 based service.
For example:

```kotlin
val radarr = Radarr(RADARR_HOST, API_KEY)
try {
    val response = radarr.movies[3829234].execute()
    if (response.isSuccessful)
        println("${response.body().title} is great!")
} catch (e: Exception) { }
```

### Android
This library ships Java 8 bytecode. This requires Android Gradle Plugin 3.2.x or newer.

## Use Proguard!
You likely will not use every method in this library, so it is probably useful to strip unused ones with Proguard.
Just apply the [Proguard rules for retrofit](https://square.github.io/retrofit/#download).

## License
Created by [Michael Haas](https://triplefrequency.com).

See full [list of contributors](https://github.com/Ather/radarr-kotlin/graphs/contributors).