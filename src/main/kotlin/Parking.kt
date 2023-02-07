import data.Car
import data.Owner
import data.ParkingSpace

object Parking {
    const val NUMBER_OF_PARKING_SPACE = 20
    private val parkingSpaces = List(NUMBER_OF_PARKING_SPACE) { index ->
        ParkingSpace(index + 1)
    }

    fun park(car: Car) {
        for (parkingSpace in parkingSpaces) {
            if (parkingSpace.isEmpty) {
                parkingSpace.car = car
                println("Автомобиль припаркован на место P${parkingSpace.number}.")
                return
            }
        }
    }

    fun returnCar(owner: Owner) {
        for (parkingSpace in parkingSpaces) {
            if (parkingSpace.car?.owner == owner) {
                println("${parkingSpace.car} забрал $owner")
                parkingSpace.car = null
                return
            }
        }
        println("Этот клиент не парковал автомобиль!")
    }

    fun showParking() {
        for (parkingSpace in parkingSpaces) {
            println(parkingSpace)
        }
    }

    fun infoByCar(carRegistrationNumber: String) {
        for (parkingSpace in parkingSpaces) {
            if (parkingSpace.car?.registrationNumber == carRegistrationNumber) {
                println("Автомобиль с номером $carRegistrationNumber припаркован на месте P${parkingSpace.number}.")
                parkingSpace.car = null
                return
            }
        }
        println("Автомобиль с номером $carRegistrationNumber не найден.")
    }

    fun infoByPlace(place: Int) {
        println(parkingSpaces[place])
    }
}