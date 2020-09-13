package domain

class God {
    companion object{
        fun createWorld(){
            println(
                "На первый день Бог создал небо, землю и свет, и отделил свет от тьмы;\n" +
                        "на второй день — создал твердь посреди воды, отделил воду над твердью от воды под твердью, и назвал " +
                        "твердь небом; \nна третий — сушу, моря и растения, \nна четвёртый — светила на тверди небесной, \nна пятый — " +
                        "рыб, пресмыкающихся и птиц. \nНаконец, на шестой — зверей земных, скот, гадов земных и человека."
            )
        }

        fun createGeoUnit(unit: GeographicUnit, day: Int) {
            println("На $day день создал Бог место под названием ${unit.name}, размером ${unit.size} км^2")
        }

        fun destructionGeoUnit(unit: GeographicUnit) {
            println("Место с названием ${unit.name} было уничтожено.")
        }
    }
}