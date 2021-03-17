static def cuadrado(n, block){
    for(int i = 1; i <= n; i++){
        block(i)
    }
}

cuadrado(10, {println "El cuadrado de $it, es ${it * it}"})
