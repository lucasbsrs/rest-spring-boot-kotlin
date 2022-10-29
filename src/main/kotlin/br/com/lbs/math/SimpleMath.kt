package br.com.lbs.math

import kotlin.math.sqrt

class SimpleMath {

    fun sum(numberOne: Double, numberTwo: Double): Double = numberOne + numberTwo;

    fun subtraction(numberOne: Double, numberTwo: Double): Double = numberOne - numberTwo;

    fun multiplication(numberOne: Double, numberTwo: Double): Double = numberOne * numberTwo;

    fun division(numberOne: Double, numberTwo: Double): Double = numberOne / numberTwo;

    fun mean(numberOne: Double, numberTwo: Double): Double = (numberOne + numberTwo) / 2;

    fun squareRoot(number: Double): Double = sqrt(number);

}