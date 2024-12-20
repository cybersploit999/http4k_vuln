package org.http4k.connect.example

import dev.forkhandles.result4k.Result
import org.http4k.connect.Action
import org.http4k.connect.RemoteFailure

interface ExampleAction<R> : Action<Result<R, RemoteFailure>>
