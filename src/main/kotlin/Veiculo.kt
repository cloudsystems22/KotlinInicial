import java.time.LocalDate

open class Veiculo {

    var cor:String = ""
    var modelo:String = ""
    var zeroKm:Boolean = true
    var dataEntrada: LocalDate = LocalDate.now()

    companion object {
        var modelo = "chevrolet"
        fun aceleral(){
            println("Acelando...")
        }

        fun freiar(){
            println("Freiando...")
        }

        fun voar() {
            println("Voando...")
        }

    }

}