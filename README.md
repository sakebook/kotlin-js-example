# kotlin-js-example

Kotlin/JS example. UMD style JavaScript.

## Build
### Use Webpack

- Browser

```sh
$ ./gradlew browserWebpack
$ open src/main/resources/index.html
```

- Node

```sh
$ ./gradlew browserWebpack
$ node src/main/resources/kotlin-js-example.js
```

### Without Webpack

- Browser

```sh
$ ./gradlew build
$ open index.html
```

- Node

```sh
$ ./gradlew build
$ node build/js/packages/kotlin-js-example/kotlin/kotlin-js-example.js
```

or

```sh
$ ./gradlew nodeRun
```

---

More at [this post (only Japanese)](https://sakebook.hatenablog.com/entry/2020/02/18/074814)

## [LICENSE](https://github.com/sakebook/kotlin-js-example/blob/master/LICENSE)
Copyright (c) 2020 sakebook Licensed under the [Apache License](https://github.com/sakebook/kotlin-js-example/blob/master/LICENSE).



