package zien.app.zien.global.error.exception

abstract class ZIENException(
    val errorCode: ErrorCode
) : RuntimeException()