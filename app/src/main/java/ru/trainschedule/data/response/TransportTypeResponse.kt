package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal enum class TransportTypeResponse {
    @SerialName("plane")
    PLANE,
    @SerialName("train")
    TRAIN,
    @SerialName("suburban")
    SUBURBAN,
    @SerialName("bus,")
    BUS,
    @SerialName("water")
    WATER,
    @SerialName("helicopter")
    HELICOPTER,
}