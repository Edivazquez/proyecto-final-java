package com.example.myapplication

fun main (parametro: Array<String>) {
    print("Ingrese el sueldo del empleado:")
    val sueldo = readln().toDouble()
    if (sueldo > 3000) {
        println("Debe pagar impuestos")
    }
}