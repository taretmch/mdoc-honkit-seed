# サンプルドキュメント

## mdoc のサンプルコード

以下のようなコードを書くと、mdoc によってコンパイルされ、REPL の実行結果が表示されます。

before:

```scala
val x = 1
List(x, x)
```

after:

```scala mdoc
val x = 1
List(x, x)
```

また、import も同一ファイル内で有効なので、

```scala mdoc
import scala.util.Try
```

このように import すれば、別のコードブロックにおいても使用することができます。

```scala mdoc
val y = Try(3)
val z = Try(1 / 0)
```
