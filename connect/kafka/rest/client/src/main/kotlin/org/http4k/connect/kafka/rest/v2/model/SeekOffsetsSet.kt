package org.http4k.connect.kafka.rest.v2.model

import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class SeekOffsetsSet(val offsets: List<SeekOffset>)
