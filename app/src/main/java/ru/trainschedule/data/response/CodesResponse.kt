package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class CodesResponse(
    @SerialName ("esr_codes")
    val esrCodes: String,
    @SerialName ("yandex_code")
    val yandexCode : String
)