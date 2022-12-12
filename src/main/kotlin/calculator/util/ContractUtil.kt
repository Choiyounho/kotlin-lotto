package calculator.util


inline fun validate(value: Boolean, lazyMessage: () -> Any) {
    if (value.not()) {
        val message = lazyMessage()
        throw RuntimeException(message.toString())
    }
}