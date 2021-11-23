# KotlinInicial

### Operações aritiméticas básicas

    println("3 + 2 = ${3 + 2}")
    println("3 - 2 = ${3 - 2}")
    println("3 * 2 = ${3 * 2}")
    println("3 / 2 = ${3 / 2}")
    println("Resto = ${3 % 2}") // operador de modulo
    println("3.0 / 2.0 = ${3.0 / 2.0}")
    println("Resto = ${3.0 / 2.0}")

    println("%.4f".format(29.0 / 10.0)) //Formatar operação 4 digitos após a virgula
    println("%.2f".format(29.0 / 10.0)) //Formatar operação 2 digitos após a virgula

###Operações aritiméticas básicas
Espaços de memória tratados como binários, operadores de potencia de 2 <br>
8  4  2  1 <br>
1  0  0  0 = 8 <br>
dobrando a potencia <br>
16  8  4  2  1 <br>
1  0  0  0  0 = 16 <br>
0  0  0  1  0 = 4 <br>
Utilizando o operador shift left podemos arrastar o bloco de memória

    println("Espaços de memória shift left 8 para 1 = ${8 shl 1}")
    println("Espaços de memória shift right 8 para 1 = ${8 shr 1}")
    println("Raiz quadrada = ${sqrt(2.0)}")
    println("Seno de 90 vezes PI = ${sin(90 * PI)}")
    println("Máximo entre 1 e 100 = ${max(1, 100)}")
    println("Minimo entre 1 e 100 = ${min(1, 100)}")

### Algumas constantes só são entendidas fora de blocos de funçãos
    const val pi:Float = 3.14159f

### Tipos primitivos
    val x = 300 //Integer
    val pi = 3.14159 //Double

    val pi:Float = 3.14159f //Alocando um espaço de memória menor

    println("Tipos constantes: $x PI: $pi")

### Variáveis
    var y = 10
    y = 1
    println("Tipos de variáveis $y")

    y = 1_000_000
    println("Tipos de variáveis $y")

    y += 1
    println("Tipos de variáveis incrementando $y")

    y -= 1
    println("Tipos de variáveis decremento $y")

    var count = 10
    println("Tipos de variáveis multiplicando $count")

    count *=2
    println("por 2 = $count")

### Tipos de dados
    val rate: Double = 19.5 // Double
    val hours: Int = 10 // Int
    val total = rate * hours // Retorna double

    println("Retorno $total")


#### Carateres unicode

    println("Caracter c = ${'c'.toInt()}")
    println("Caracter o = ${'o'.toInt()}")
    println("Caracter d = ${'d'.toInt()}")
    println("Caracter e = ${'e'.toInt()}")

    println("---OU---")

    val c = 99
    val o = 111
    val d = 100
    val e = 101
    println("Caracter 99  = ${c.toChar()}")
    println("Caracter 111 = ${o.toChar()}")
    println("Caracter 100 = ${d.toChar()}")
    println("Caracter 101 = ${e.toChar()}")

    val text = """
        ------------------------------------------------------------------
        Olá mundo! 
        Estudo de tipos no Kotlin.
        O valor de X: 120.0 / Y:5 é igual à: ${120.0 / 5}
        ------------------------------------------------------------------
    """.trimIndent()

    println(text)

#### Utilizando o objeto Pair, aceita qualquer tipo de dados
    println("------- Objeto Pair ------------------------------------")
    val coordinates = Pair(12.0002344, 23.90000090)
    println("Aceita qualquer tipo de dados $coordinates")
    println("Primeiro ${coordinates.first}")
    println("Segundo ${coordinates.second}")

    val tiposDiversos = Pair(23.5, "Tipo texto")
    println("Aceita qualquer tipo de dados $tiposDiversos")
    println("Double ${tiposDiversos.first}")
    println("String ${tiposDiversos.second}")

    val coordTriple = Triple(12.0002344, "São Paulo", 23.90000090)
    println("Objeto triplo $coordTriple")
    println("Primeiro ${coordTriple.first}")
    println("Segundo ${coordTriple.second}")
    println("Terceiro ${coordTriple.third}")

    println("------- Desestruturação ------------------------------------")

    val coord = 1 to 10
    println("Objeto = $coord")

    val (x, y) = coord
    println("Objeto X: $x | Objeto Y: $y")

    val byte:Byte = 1 // 1 byte
    val short:Short = 1 // 2 bytes
    val int:Int = 1 // 4 bytes
    val long:Long = 1 // 8 bytes

    val float:Float = 1.0f // 1 byte | 6 digitos
    val double:Double = 1.0 // 1 byte | 15 digitos

#### Anit, unit, nothing

    val numberAny: Any = 10
    val textAny: Any = "10"

### Fuções

    fun add(x:Int, y:Int) : Int {
        return x + y
    }
    
    add(10, 12)

#### Utilizado normalmente para executar tarefas constantes
    fun forever():Nothing {
        var cont = 0
        while(true){
            cont += 1
            Thread.sleep(1000)
            println("$cont segundo(s)")
        }
    }

#### Condicionais
    val yes = true
    val no = false

    println("Resultado 1 == 2 : ${(1 == 2)}")
    println("Resultado 1 != 2 : ${(1 != 2)}")
    println("Resultado 1 > 2 : ${(1 > 2)}")
    println("Resultado 1 < 2 : ${(1 < 2)}")
    println("Resultado 1 <= 2 : ${(1 <= 2)}")
    println("Resultado 1 >= 2 : ${(1 >= 2)}")

    val and = true && false
    println("And true && false : $and")
    val or = true || false
    println("or true || false : $or")