@JsModule("dayjs")
@JsNonModule
@JsName("dayjs")
external fun dayjs(any: Any? = definedExternally): dynamic

fun main() {
    println("Hello Kotlin/JS!! ${dayjs()}")
    println("this year         ${dayjs().year()}")
    println("Valentine         ${dayjs("2020-02-14")}")
    println("Formatted date    ${dayjs().format()}")
}
