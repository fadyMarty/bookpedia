package com.fadymarty.bookpedia.core.presentation

import bookpedia.shared.generated.resources.Res
import bookpedia.shared.generated.resources.error_disk_full
import bookpedia.shared.generated.resources.error_no_internet
import bookpedia.shared.generated.resources.error_request_timeout
import bookpedia.shared.generated.resources.error_serialization
import bookpedia.shared.generated.resources.error_too_many_requests
import bookpedia.shared.generated.resources.error_unknown
import com.fadymarty.bookpedia.core.domain.DataError

fun DataError.toUiText(): UiText {
    val stringRes = when (this) {
        DataError.Local.DISK_FULL -> Res.string.error_disk_full
        DataError.Local.UNKNOWN -> Res.string.error_unknown
        DataError.Remote.REQUEST_TIMEOUT -> Res.string.error_request_timeout
        DataError.Remote.TOO_MANY_REQUESTS -> Res.string.error_too_many_requests
        DataError.Remote.NO_INTERNET -> Res.string.error_no_internet
        DataError.Remote.SERVER -> Res.string.error_unknown
        DataError.Remote.SERIALIZATION -> Res.string.error_serialization
        DataError.Remote.UNKNOWN -> Res.string.error_unknown
    }

    return UiText.StringResourceId(stringRes)
}