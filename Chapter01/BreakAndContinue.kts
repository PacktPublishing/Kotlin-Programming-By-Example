data class Student(val name: String, val age: Int, val school: String)

val prospectiveStudents: ArrayList<Student> = ArrayList()
val admittedStudents: ArrayList<Student> = ArrayList()

prospectiveStudents.add(Student("Daniel Martinez", 12, "Hogwarts"))
prospectiveStudents.add(Student("Jane Systrom", 22, "Harvard"))
prospectiveStudents.add(Student("Matthew Johnson", 22, "University of Maryland"))
prospectiveStudents.add(Student("Jide Sowade", 18, "University of Ibadan"))
prospectiveStudents.add(Student("Tom Hanks", 25, "Howard University"))

for (student in prospectiveStudents) {
  if (student.age < 16) {
    continue
  }
  admittedStudents.add(student)

  if (admittedStudents.size >= 3) {
    break
  }
}

println(admittedStudents)
