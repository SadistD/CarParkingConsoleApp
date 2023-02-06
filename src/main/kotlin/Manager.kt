import data.Command

object Manager {
    private var end = false
    fun getCommand() {
        while (!end) {
            println("Введите команду:")
            when (readln()) {
                Command.START.commandText -> printHelloMessage()
                Command.HELP.commandText -> printHelpMessage()
                Command.END.commandText -> endProgram()
                else -> printErrorMessage()
            }
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