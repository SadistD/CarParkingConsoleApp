package data

class ParkingSpace(val number: Int, car: Car? = null) {

    var car = car
        set(value) {
            isEmpty = value == null
            field = value
        }

    var isEmpty = true

    override fun toString(): String {
        return if(isEmpty)"P$number - FREE" else "P$number - $car"
    }
}