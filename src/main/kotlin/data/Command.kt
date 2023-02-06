package data

enum class Command(val commandText: String, val commandDescription: String) {
    START(
        "/start",
        "Выводит приветственное сообщение"
    ),
    HELP(
        "/help",
        "Выводит список доступных команд"
    ),
    END(
        "/end",
        "Завершает работу программы"
    ),
    PARK(
        "/park",
        "Паркует автомобиль (находится в разработке)"
    ),
    RETURN(
        "/return",
        "Возвращает автомобиль владельцу (находится в разработке)"
    ),
    SHOW_PARKING(
        "/show_parking",
        "Показывает парковку (находится в разработке)"
    ),
    PARK_INFO_BY_CAR(
        "/park_info_by_car",
        "Выводит информацию об автомобиле (находится в разработке)"
    ),
    PARK_INFO_BY_PLACE(
        "/park_info_by_place",
        "Выводит информацию о парковочном месте (находится в разработке)"
    ),
    PARK_STATS(
        "/park_stats",
        "Выводит текущую загрузку парковки (находится в разработке)"
    ),
    PARK_ALL_STATS(
        "/park_all_stats",
        "Выводит сколько всего машин было припарковано за все время работы программы (находится в разработке)"
    )
}