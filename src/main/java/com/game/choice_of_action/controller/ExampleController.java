package com.game.choice_of_action.controller;

/*@RestController
@Tag(name = "pet-controller", description = "operations with Pets")
public class ExampleController {

  private List<Employee> employees = createList();

  @Operation(summary = "get pet by id")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successfully get a Pet",
          content = @Content(mediaType = "application/json")),
      @ApiResponse(responseCode = "404", description = "Pet not found",
          content = @Content(mediaType = "application/json")),
      @ApiResponse(responseCode = "400", description = "Pet not yours",
          content = @Content(mediaType = "application/json"))
  })
  @RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
  public List<Employee> firstPage() {
    return employees;
  }

  @DeleteMapping(path = { "/{id}" })
  public Employee delete(@PathVariable("id") int id) {
    Employee deletedEmp = null;
    for (Employee emp : employees) {
      if (emp.getEmpId().equals(id)) {
        employees.remove(emp);
        deletedEmp = emp;
        break;
      }
    }
    return deletedEmp;
  }

  @PostMapping
  public Employee create(@RequestBody Employee user) {
    employees.add(user);
    System.out.println(employees);
    return user;
  }

  private static List<Employee> createList() {
    List<Employee> tempEmployees = new ArrayList<>();
    Employee emp1 = new Employee();
    emp1.setName("emp1");
    emp1.setDesignation("manager");
    emp1.setEmpId("1");
    emp1.setSalary(3000);

    Employee emp2 = new Employee();
    emp2.setName("emp2");
    emp2.setDesignation("developer");
    emp2.setEmpId("2");
    emp2.setSalary(3000);
    tempEmployees.add(emp1);
    tempEmployees.add(emp2);
    return tempEmployees;
  }
}*/
