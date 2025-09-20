package com.termin8rs.healthai.data

import kotlinx.serialization.Serializable

@Serializable
sealed class Destination {
    @Serializable
    object HEALTHAI : Destination()
    @Serializable
    object PREVENTIONHUB : Destination()
    @Serializable
    object SYMPTOMCHECKER : Destination()
    @Serializable
    object VACCINATIONCENTER : Destination()
    @Serializable
    object PROFILE : Destination()
}