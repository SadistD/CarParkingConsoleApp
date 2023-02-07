import data.Car
import data.Command
import data.Owner

object Manager {
    private const val SIZE_FOR_CORRECT_PARKING = 5

    private var end = false
    fun getCommand() {
        while (!end) {
            println("Введите команду:")
            when (readln()) {
                Command.START.commandText -> printHelloMessage()
                Command.HELP.commandText -> printHelpMessage()
                Command.END.commandText -> endProgram()
                Command.PARK.commandText -> parkingCar()
                else -> printErrorMessage()
            }
        }
    }

    private fun parkingCar() {
        println("Введите: марку, цвет, регистрационный номер автомобиля, имя и фамилю владельца")
        val command = readln().split(" ")
        if (command.size == SIZE_FOR_CORRECT_PARKING) {
            val owner = Owner(command[3], command[4])
            val car = Car(command[0], command[1], command[2], owner)
            Parking.park(car)
        } else {
            println("Введены некорректные данные!\n" +
                    "Команда отменена.")
        }
    }

    private fun endProgram() {
        println("Работа программы завершена.\nХорошего дня!")
        end = true
    }

    private fun printErrorMessage() {
        println("Команда недоступна, для получения информации о командах используйте /help")
    }

    private fun printHelpMessage() {
        println(Command.values().joinToString(separator = "\n") { "${it.commandText} - ${it.commandDescription}" })
    }

    private fun printHelloMessage() {
        println("Добро пожаловать в приложение для парковки автомобилей!")
    }

}