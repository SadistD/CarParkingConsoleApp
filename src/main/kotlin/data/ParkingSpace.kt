package data

class ParkingSpace(val number: Int, car: Car? = null) {
    var isEmpty = true
    var car = car
        set(value) {
            isEmpty = car == null
            field = value
        }

    override fun toString(): String {
        return "P$number - $car"
    }
}