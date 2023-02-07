import data.Car
import data.Owner
import data.ParkingSpace

object Parking {
    private const val NUMBER_OF_PARKING_SPACE = 20
    private val parkingSpaces = List(NUMBER_OF_PARKING_SPACE) { index ->
        ParkingSpace(index + 1)
    }

    fun park(car: Car) {
        for (parkingSpace in parkingSpaces){
            if (parkingSpace.isEmpty){
                parkingSpace.car = car
                println("Автомобиль припаркован на место P${parkingSpace.number}.")
                return
            }
        }
    }

    fun returnCar(owner: Owner) {
        TODO("Not yet implemented")
    }

    fun showParking() {
        TODO("Not yet implemented")
    }

    fun infoByCar() {
        TODO("Not yet implemented")
    }

    fun infoByPlace() {
        TODO("Not yet implemented")
    }
}