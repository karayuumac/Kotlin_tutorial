/**
 * Created by karayuu on 2017/10/15
 * Developer of Gigantic☆Seichi Server
 * Support at dev-basic or dev-extreme channel of Discord
 */
//＜変数＞
//kotlinでは変数には2種類ある。変更不可能な変数と変更可能な変数。それぞれ以下のようにあらわす。

//変更不可能な変数。valって書く
val a = 100

//javaで書くと
// final int a = 100;
//お分かりのように、Kotlinには";"が不要である。

//変更可能な変数。varって書く
var b = 100

//<val/var> <変数名> = <初期値>
//基本的にはvalを使用して変更しなければいけない変数のみをvarに変えればいい

//<型推論＞
//kotlinには便利な機能があって、コンパイラ自身が変数の型を推論してくれる。
//別に上のコードはこう書いてもいい

val c: Int = 100
var d: Int = 100
//<val/var> <変数名>: <型名> = <初期値>

//<暗黙の型変換>
//kotlinには暗黙の型変換が存在しない。つまり、Int型の変数をDouble型の変数に代入することはできない!

val e: Int = 100
val f: Double = e //コンパイルエラー
//ただし無理やり変えれば大丈夫
val g: Double = e.toDouble()
