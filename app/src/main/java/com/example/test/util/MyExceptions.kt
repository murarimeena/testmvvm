package com.example.test.util

import java.io.IOException

class APIException(msg: String) : IOException(msg)

class NoNetworkException(msg: String) : IOException(msg)