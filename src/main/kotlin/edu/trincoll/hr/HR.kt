package edu.trincoll.hr

// The HR class should have:
//   - a list of employees
//   - a hire method that takes an employee and returns a new HR object with that employee added
//   - a fire method that takes an id and returns a new HR object with the employee with that id removed
//   - a payEmployees method that returns the total pay of all employees
class HR(private val employees: List<Employee> = emptyList()) {
    fun hire(employee: Employee): HR {
        val newEmployee = employees + employee
        return HR(newEmployee)
    }

    fun fire(id: Int): HR{
        var remainingEmployee = employees.filter { it.id != id }
        return HR(remainingEmployee)
    }

    fun payEmployees(employees: List<Employee>): Double {
        var sumOfPay : Double=0.0
        for(employee in employees){
            sumOfPay += employee.pay()
        }
        return sumOfPay
    }



}