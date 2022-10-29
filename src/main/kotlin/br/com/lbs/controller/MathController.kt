package br.com.lbs.controller

import br.com.lbs.converters.NumberConverter.convertToDouble
import br.com.lbs.converters.NumberConverter.isNumeric
import br.com.lbs.exceptions.UnsupportedMathOperationException
import br.com.lbs.math.SimpleMath
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong
import kotlin.math.sqrt

@RestController
class MathController {

    val counter: AtomicLong = AtomicLong();

    private val math: SimpleMath = SimpleMath();

    @RequestMapping(value = ["/sum/{numberOne}/{numberTwo}"])
    fun sum(@PathVariable(value = "numberOne") numberOne: String?,
            @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw UnsupportedMathOperationException("O parâmetro deve ser numérico");

        return math.sum(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping(value = ["/subtraction/{numberOne}/{numberTwo}"])
    fun subtraction(@PathVariable(value = "numberOne") numberOne: String?,
            @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw UnsupportedMathOperationException("O parâmetro deve ser numérico");

        return math.subtraction(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping(value = ["/multiplication/{numberOne}/{numberTwo}"])
    fun multiplication(@PathVariable(value = "numberOne") numberOne: String?,
                    @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw UnsupportedMathOperationException("O parâmetro deve ser numérico");

        return math.multiplication(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping(value = ["/division/{numberOne}/{numberTwo}"])
    fun division(@PathVariable(value = "numberOne") numberOne: String?,
                       @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw UnsupportedMathOperationException("O parâmetro deve ser numérico");

        return math.division(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping(value = ["/mean/{numberOne}/{numberTwo}"])
    fun mean(@PathVariable(value = "numberOne") numberOne: String?,
                 @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw UnsupportedMathOperationException("O parâmetro deve ser numérico");

        return math.mean(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping(value = ["/squareRoot/{number}"])
    fun squareRoot(@PathVariable(value = "number") number: String?): Double {
        if(!isNumeric(number) ) throw UnsupportedMathOperationException("O parâmetro deve ser numérico");

        return math.squareRoot(convertToDouble(number));
    }

}
