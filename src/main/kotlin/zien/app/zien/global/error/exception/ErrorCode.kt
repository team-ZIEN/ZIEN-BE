package zien.app.zien.global.error.exception

enum class ErrorCode(
    val status: Int,
    val message: String
) {
    // Internal Server Error
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
}