package br.com.lbs.exceptions

import java.lang.Exception
import java.lang.RuntimeException

class UnsupportedMathOperationException(exception: String): RuntimeException(exception)